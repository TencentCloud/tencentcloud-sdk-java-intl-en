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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupInfo extends AbstractModel {

    /**
    * Group name
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Group ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Custom group description field
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupExDescriptions")
    @Expose
    private String [] GroupExDescriptions;

    /**
    * Group remarks
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * Group creation time and date (`CreationTimestamp`), whose value is the number of milliseconds between the UNIX epoch time and the group creation time. 
The UNIX epoch time is 00:00:00, Thursday, January 1, 1970, Coordinated Universal Time (UTC). For more information, please see the UNIX time document.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private Long CreationTimestamp;

    /**
     * Get Group name 
     * @return GroupName Group name
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Group name
     * @param GroupName Group name
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Group ID 
     * @return GroupId Group ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID
     * @param GroupId Group ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Custom group description field
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GroupExDescriptions Custom group description field
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getGroupExDescriptions() {
        return this.GroupExDescriptions;
    }

    /**
     * Set Custom group description field
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GroupExDescriptions Custom group description field
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupExDescriptions(String [] GroupExDescriptions) {
        this.GroupExDescriptions = GroupExDescriptions;
    }

    /**
     * Get Group remarks
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Tag Group remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Group remarks
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Tag Group remarks
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FaceModelVersion Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FaceModelVersion Algorithm model version used for face recognition.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * Get Group creation time and date (`CreationTimestamp`), whose value is the number of milliseconds between the UNIX epoch time and the group creation time. 
The UNIX epoch time is 00:00:00, Thursday, January 1, 1970, Coordinated Universal Time (UTC). For more information, please see the UNIX time document.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CreationTimestamp Group creation time and date (`CreationTimestamp`), whose value is the number of milliseconds between the UNIX epoch time and the group creation time. 
The UNIX epoch time is 00:00:00, Thursday, January 1, 1970, Coordinated Universal Time (UTC). For more information, please see the UNIX time document.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set Group creation time and date (`CreationTimestamp`), whose value is the number of milliseconds between the UNIX epoch time and the group creation time. 
The UNIX epoch time is 00:00:00, Thursday, January 1, 1970, Coordinated Universal Time (UTC). For more information, please see the UNIX time document.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CreationTimestamp Group creation time and date (`CreationTimestamp`), whose value is the number of milliseconds between the UNIX epoch time and the group creation time. 
The UNIX epoch time is 00:00:00, Thursday, January 1, 1970, Coordinated Universal Time (UTC). For more information, please see the UNIX time document.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCreationTimestamp(Long CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    public GroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupInfo(GroupInfo source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupExDescriptions != null) {
            this.GroupExDescriptions = new String[source.GroupExDescriptions.length];
            for (int i = 0; i < source.GroupExDescriptions.length; i++) {
                this.GroupExDescriptions[i] = new String(source.GroupExDescriptions[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.FaceModelVersion != null) {
            this.FaceModelVersion = new String(source.FaceModelVersion);
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new Long(source.CreationTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "GroupExDescriptions.", this.GroupExDescriptions);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);

    }
}

