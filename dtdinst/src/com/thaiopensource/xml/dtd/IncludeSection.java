package com.thaiopensource.xml.dtd;

public class IncludeSection extends TopLevel {
  
  private final Flag flag;
  private final TopLevel[] contents;

  public IncludeSection(Flag flag, TopLevel[] contents) {
    this.flag = flag;
    this.contents = contents;
  }

  public int getType() {
    return INCLUDE_SECTION;
  }

  public Flag getFlag() {
    return flag;
  }
  
  public TopLevel[] getContents() {
    TopLevel[] tem = new TopLevel[contents.length];
    System.arraycopy(contents, 0, tem, 0, contents.length);
    return tem;
  }

  public void accept(TopLevelVisitor visitor) throws Exception {
    visitor.includeSection(flag, getContents());
  }

}
