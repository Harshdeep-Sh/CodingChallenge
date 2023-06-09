public class SmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
		int res=0;
		if(target>=letters[letters.length-1])
		{
		    return (letters[0]);
		}

		for(int i=0;i<letters.length;i++)
		{
		    
		    if(target<letters[i])
		    {
		        res=letters[i];
		        break;
		    }
		}
		char ch= (char)res;
        return(ch);
    }
}
