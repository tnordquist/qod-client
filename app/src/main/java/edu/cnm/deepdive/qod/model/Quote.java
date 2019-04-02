package edu.cnm.deepdive.qod.model;

import com.google.gson.annotations.Expose;
import java.net.URI;
import java.util.Date;
import java.util.UUID;

public class Quote {

  @Expose // Gson library (nothing to do with Room)
  private UUID id;

  @Expose
  private Date created;

  @Expose
  private String text;

  @Expose
  private Source[] sources;

  @Expose
  private URI href;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Source[] getSources() {
    return sources;
  }

  public void setSources(Source[] sources) {
    this.sources = sources;
  }

  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

}
