package edu.cnm.deepdive.qod.model;

import com.google.gson.annotations.Expose;
import java.net.URI;
import java.util.Date;
import java.util.UUID;

public class Source {

  @Expose
  private UUID id;

  @Expose
  private Date created;

  @Expose
  private String name;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public URI getHref() {
    return href;
  }

  public void setHref(URI href) {
    this.href = href;
  }

}
