 class Solution {
 public static List<List<String>> groupAnagrams(String[] strs) {
	        Map<String,List<String>> map=new HashMap<>();
	        for(int i=0;i<strs.length;i++){
	            int size[]=new int[26];
	            String word = strs[i];
	            for(int j=0;j<word.length();j++){
	                size[word.charAt(j) - 'a']++;
	            }
	            String keyvalue = Arrays.toString(size);
	            if(map.get(keyvalue) == null) {
	            	List<String> analist=new ArrayList<>();
	            			analist.add(strs[i]);
	                map.put(keyvalue,analist );
	            } else{
	                List<String> valuesList = map.get(keyvalue);
	                valuesList.add(strs[i]);
	            }
	        }
	    return new ArrayList<List<String>>(map.values());
	    }
 }