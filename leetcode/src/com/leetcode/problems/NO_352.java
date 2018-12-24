package com.leetcode.problems;

import java.util.LinkedList;
import java.util.List;

import com.leetcode.clazz.Interval;

/**
 * Data Stream as Disjoint Intervals
 * @author Administrator
 *
 */
public class NO_352 {

}

class SummaryRanges {

    List<Interval> list;
	
	/** Initialize your data structure here. */
    public SummaryRanges() {
    	list = new LinkedList<>();
    }
    
    public void addNum(int val) {
    	if(list.isEmpty()){  list.add(new Interval(val,val));  return ; }
    	
    	final int MIN = 0;
    	final int MAX = list.size() - 1;
    	
    	Interval tmp;
    	int compare_next;
    	
		if((compare_next = compareInterval(list.get(MIN), val)) <= 0){  //compare with head
			switch (compare_next) {
			case -1: list.get(MIN).start = val;             break; //val + 1 == head.start
			case -2: list.add(MIN, new Interval(val,val));  break; //val + 1 < head.start
			}
		}else if((compare_next = compareInterval(list.get(MAX), val)) >= 0){   //compare with tail
			switch (compare_next) {
			case 1: list.get(MAX).end = val;          break;    // val - 1 == tail.end
			case 2: list.add(new Interval(val,val));  break;    // val - 1 > tail.end
			}
		}else{
			
			int position = findPosition(val);
			tmp = list.get(position);
			compare_next = compareInterval(tmp, val);
	    	
			Interval tmp_pre = list.get(position - 1);
    		int compare_pre = compareInterval(tmp_pre, val); 
    		
    		if(compare_next == -1 && compare_pre == 1){                                                      //val + 1 == next.start && val - 1 == pre.end
    			tmp_pre.end = tmp.end;
    			list.remove(tmp);
    		}
    		else if(compare_next == -2 && compare_pre == 2)     list.add(position, new Interval(val,val));   //val + 1 < next.start && val - 1 > pre.end
    		else if(compare_next == -1)                         tmp.start = val;                             //val + 1 == next.start
    		else if(compare_pre == 1)                           tmp_pre.end = val;                           //val - 1 == pre.end
			
		}
    }
    
    public List<Interval> getIntervals() {
    	return list;
    }
    
    /**
     * 
     * @param first
     * @param val
     * @return 0      start <= val && val <= end
     *         -1     start - 1 == val
     *         -2     start - 1 > val
     *          1     end  + 1 == val
     *          2     end + 1 > val      
     */ 
    public int compareInterval(Interval first,int val){
    	if(first.start > val)       return (first.start == val + 1) ? -1 : -2; 
    	else if(first.end < val)    return (first.end + 1 == val ) ? 1 : 2; 
    	return 0;
    }
    
    public int findPosition(int val){
    	int min = 0;
    	int max = list.size() - 1;
    	int mid = max / 2;
    	while(min < max - 1){
    		if(list.get(mid).start > val) max = mid;
    		else min = mid;
    		mid = min + (max - min) / 2;
    	}   	
    	return list.get(min).start < val ? max : min;
    }
}