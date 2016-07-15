package messages;

import java.io.Serializable;
import java.util.Date;

public class Message implements Comparable, Serializable {
  private static final long serialVersionUID = 7146681148113043748L;
  //private boolean mBreakIt = true;
  private String mAuthor;
  private String mDescription;
  private Date mCreationDate;
  
  public Message(String author, String description, Date creationDate) {
    mAuthor = author;
    mDescription = description;
    mCreationDate = creationDate;
  }

  @Override
  public String toString() {
    return String.format("Msg: \"%s\" by @%s on %s",
                         mDescription, mAuthor, mCreationDate);
  }
  
  @Override
  public int compareTo(Object obj) {
    Message other = (Message) obj;
    if (equals(other)) {
      return 0;
    }
    int dateCmp = mCreationDate.compareTo(other.mCreationDate);
    if (dateCmp == 0) {
      return mCreationDate.compareTo(other.mCreationDate);
    }
    return dateCmp;
  }
  
  public String getAuthor() {
    return mAuthor;
  }
  
  public String getDescription() {
    return mDescription;
  }
  
  public Date getCreationDate() {
    return mCreationDate;
  }
  
  public String[] getWords() {
    
    //return regular expression: [^\\w#@']+
      
    return mDescription.toLowerCase().split("[^\\w#@']+");
  }
  
  
}
