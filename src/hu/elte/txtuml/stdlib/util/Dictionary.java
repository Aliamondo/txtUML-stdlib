package hu.elte.txtuml.stdlib.util;

	
import java.util.Enumeration;

	import hu.elte.txtuml.api.model.external.ExternalClass;


	/**
	 * This class provides the functionality of the dictionary Java class for txtUML models.
	 * <p>   
	 * 
     * @author  Kovan Rashid  
     * @see     java.lang.Object#hashCode()
     * @see     java.util.Hashtable
     */
	
		public interface Dictionary extends ExternalClass{
			
			/**
			 * Tests if this dictionary maps no keys to value. The general contract
			 * for the <tt>isEmpty</tt> method is that the result is true if and only
			 * if this dictionary contains no entries.
			 *
			 * @return  <code>true</code> if this dictionary maps no keys to values;
			 *          <code>false</code> otherwise.
			 */
			public boolean isEmpty();
			
			/**
			 * Returns the number of entries (distinct keys) in this dictionary.
			 * @return  the number of keys in this dictionary.
			 */
			public int size();
			
			/**
			 * Returns an enumeration of the keys in this dictionary. The general
			 * contract for the keys method is that an <tt>Enumeration</tt> object
			 * is returned that will generate all the keys for which this dictionary
			 * contains entries.
			 * 
			 * @return  an enumeration of the keys in this dictionary.
			 * @see     java.util.Enumeration
			 */	
			public Enumeration<Integer> keys();
			
			/**
			 * Returns an enumeration of the values in this dictionary. The general
			 * contract for the <tt>elements</tt> method is that an
			 * <tt>Enumeration</tt> is returned that will generate all the elements
			 * contained in entries in this dictionary.
			 * 
			 * @return  an enumeration of the values in this dictionary.
			 * @see java.util.Enumeration
			 */
			public Enumeration<String> elements();
			
			/**
			 * Returns the value to which the key is mapped in this dictionary.
			 * The general contract for the <tt>isEmpty</tt> method is that if this
			 * dictionary contains an entry for the specified key, the associated
			 * value is returned; otherwise, <tt>null</tt> is returned.
			 *
			 * @return  the value to which the key is mapped in this dictionary;
			 * @param   key   a key in this dictionary.
			 *          <code>null</code> if the key is not mapped to any value in
			 *          this dictionary.
			 * @exception NullPointerException if the <tt>key</tt> is <tt>null</tt>.
			 */
			public String get(int key);
			
			/**
			 * Maps the specified <code>key</code> to the specified
			 * <code>value</code> in this dictionary. Neither the key nor the
			 * value can be <code>null</code>.
			 * <p>
			 * If this dictionary already contains an entry for the specified
			 * <tt>key</tt>, the value already in this dictionary for that
			 * <tt>key</tt> is returned, after modifying the entry to contain the
			 *  new element. <p>If this dictionary does not already have an entry
			 *  for the specified <tt>key</tt>, an entry is created for the
			 *  specified <tt>key</tt> and <tt>value</tt>, and <tt>null</tt> is
			 *  returned.
			 * <p>
			 * The <code>value</code> can be retrieved by calling the
			 * <code>get</code> method with a <code>key</code> that is equal to
			 * the original <code>key</code>.
			 *
			 * @param      key     the hashtable key.
			 * @param      value   the value.
			 * @return     the previous value to which the <code>key</code> was mapped
			 *             in this dictionary, or <code>null</code> if the key did not
			 *             have a previous mapping.
			 * @exception  NullPointerException  if the <code>key</code> or
			 *               <code>value</code> is <code>null</code>.
			 */
			public String put(int key,String value);
			
			/**
			 * Removes the <code>key</code> (and its corresponding
			 * <code>value</code>) from this dictionary. This method does nothing
			 * if the <code>key</code> is not in this dictionary.
			 *
			 * @param   key   the key that needs to be removed.
			 * @return  the value to which the <code>key</code> had been mapped in this
			 *          dictionary, or <code>null</code> if the key did not have a
			 *          mapping.
			 * @exception NullPointerException if <tt>key</tt> is <tt>null</tt>.
			 */
			public String remove(int key);
				
		}


		
