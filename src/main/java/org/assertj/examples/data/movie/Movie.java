/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2013 the original author or authors.
 */
package org.assertj.examples.data.movie;

import java.util.Date;

public class Movie {

  private String title;
  private Date releaseDate;

  public Movie(String title, Date releaseDate) {
    super();
    this.title = title;
    this.releaseDate = releaseDate;
  }

  public String getTitle() {
    return title;
  }
  
  public Date getReleaseDate() {
    return releaseDate;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((releaseDate == null) ? 0 : releaseDate.hashCode());
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Movie other = (Movie) obj;
    if (releaseDate == null) {
      if (other.releaseDate != null) return false;
    } else if (!releaseDate.equals(other.releaseDate)) return false;
    if (title == null) {
      if (other.title != null) return false;
    } else if (!title.equals(other.title)) return false;
    return true;
  }

}
