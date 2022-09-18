package hashing;

public class ImplementationOfOpenAddressing {
	
	int[] arr;
	int cap,size;
	
	ImplementationOfOpenAddressing(int c)
	{
		cap = c;
		size = 0;
		arr = new int[cap];
		for(int i = 0; i<cap; i++)
			arr[i]=-1;
	}
	
	public static void main(String[] args) {
		
		int cap =7;
		
		ImplementationOfOpenAddressing im = new ImplementationOfOpenAddressing(cap);
		
		im.insert(49);
		im.insert(56);
		im.insert(72);
		
		if(im.search(56)== true)
			System.out.println("yes");
		else
			System.out.println("no");
		im.erase(56);
		if(im.search(56) == true)
			System.out.println("yes");
		else
			System.out.println("no");

	}
	
	int hash(int key)
	{
		return key%cap;
	}
	
//	insert function
	
	boolean insert(int key)
	{
		if(size == cap) return false;
		int i = hash(key);
		while(arr[i] != -1 && arr[i] != -2 && arr[i] != key)
			i = (i+1)%cap;
		if(arr[i] == key) return false;
		else {
			arr[i] = key;
			size++;
			return true;
		}
	}
//	search function
	
	boolean search(int key) {
		int h = hash(key);
		int i = h;
		while(arr[i] != -1) {
			if(arr[i] == key) return true;
			i = (i+1)%cap; 	// go to next index circularly 
			if(i ==h) return false;
		}
		return false;
	}
	
//	erase function
	
	boolean erase(int key) {
		int h = hash(key);
		int i = h;
		while(arr[i] != -1) {
			if(arr[i] == key) {
				arr[i] = -2;
				return true;
			}
			i = (i+1)%cap;
			if(i == h) return false;
		}
		return false;
	}

	
}
