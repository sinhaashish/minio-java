/*
 * MinIO Java SDK for Amazon S3 Compatible Cloud Storage, (C) 2020 MinIO, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.minio.messages;

import org.xmlpull.v1.XmlPullParserException;

import com.google.api.client.util.Key;
import java.util.List;


/**
 * Helper class to construct create bucket encryption configuration request XML for Amazon AWS S3.
 */
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = "URF_UNREAD_FIELD")
public class ServerSideEncryptionConfiguration extends XmlEntity {

  @Key("Rule")
  private List<ServerSideEncryptionByDefault> rules;
  //private Rule rule;


  /**
   * Constructs a new ServerSideEncryptionConfiguration object.
   */
  public ServerSideEncryptionConfiguration() throws XmlPullParserException {
    super();
    super.name = "ServerSideEncryptionConfiguration";
    super.namespaceDictionary.set("", "http://s3.amazonaws.com/doc/2006-03-01/");
  }


  /**
   * Constructs a new ServerSideEncryptionConfiguration object with given retention.
   */
  public ServerSideEncryptionConfiguration(ServerSideEncryptionByDefault serverSideEncryptionByDefault) 
    throws XmlPullParserException {
    this();
    this.rules.add(serverSideEncryptionByDefault);
  }
}
