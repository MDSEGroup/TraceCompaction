package org.modelexecution.examples.iml.sequentialiml.aspects;

import java.util.Map;
import org.modelexecution.examples.iml.sequentialiml.aspects.CommentAspectCommentAspectProperties;
import org.modelexecution.examples.iml.sequentialiml.iml.Comment;

@SuppressWarnings("all")
public class CommentAspectCommentAspectContext {
  public final static CommentAspectCommentAspectContext INSTANCE = new CommentAspectCommentAspectContext();
  
  public static CommentAspectCommentAspectProperties getSelf(final Comment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.modelexecution.examples.iml.sequentialiml.aspects.CommentAspectCommentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Comment, CommentAspectCommentAspectProperties> map = new java.util.WeakHashMap<org.modelexecution.examples.iml.sequentialiml.iml.Comment, org.modelexecution.examples.iml.sequentialiml.aspects.CommentAspectCommentAspectProperties>();
  
  public Map<Comment, CommentAspectCommentAspectProperties> getMap() {
    return map;
  }
}
