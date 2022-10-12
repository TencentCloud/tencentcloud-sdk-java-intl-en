/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrNamespaceInfo extends AbstractModel{

    /**
    * Namespace name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Access level
    */
    @SerializedName("Public")
    @Expose
    private Boolean Public;

    /**
    * Namespace ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private Long NamespaceId;

    /**
    * Cloud tag of the instance
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

    /**
    * Namespace metadata
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Metadata")
    @Expose
    private KeyValueString [] Metadata;

    /**
     * Get Namespace name 
     * @return Name Namespace name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Namespace name
     * @param Name Namespace name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Creation time 
     * @return CreationTime Creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Creation time
     * @param CreationTime Creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Access level 
     * @return Public Access level
     */
    public Boolean getPublic() {
        return this.Public;
    }

    /**
     * Set Access level
     * @param Public Access level
     */
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

    /**
     * Get Namespace ID 
     * @return NamespaceId Namespace ID
     */
    public Long getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace ID
     * @param NamespaceId Namespace ID
     */
    public void setNamespaceId(Long NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Cloud tag of the instance
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagSpecification Cloud tag of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set Cloud tag of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagSpecification Cloud tag of the instance
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    /**
     * Get Namespace metadata
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Metadata Namespace metadata
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KeyValueString [] getMetadata() {
        return this.Metadata;
    }

    /**
     * Set Namespace metadata
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Metadata Namespace metadata
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMetadata(KeyValueString [] Metadata) {
        this.Metadata = Metadata;
    }

    public TcrNamespaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TcrNamespaceInfo(TcrNamespaceInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CreationTime != null) {
            this.CreationTime = new String(source.CreationTime);
        }
        if (source.Public != null) {
            this.Public = new Boolean(source.Public);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new Long(source.NamespaceId);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
        }
        if (source.Metadata != null) {
            this.Metadata = new KeyValueString[source.Metadata.length];
            for (int i = 0; i < source.Metadata.length; i++) {
                this.Metadata[i] = new KeyValueString(source.Metadata[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);
        this.setParamArrayObj(map, prefix + "Metadata.", this.Metadata);

    }
}

