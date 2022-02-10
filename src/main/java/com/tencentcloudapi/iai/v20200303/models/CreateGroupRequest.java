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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGroupRequest extends AbstractModel{

    /**
    * Group name, which is modifiable, must be unique, and can contain 1 to 60 characters.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Group ID, which is unmodifiable, must be unique, and can contain letters, digits, and special symbols (-%@#&_) of up to 64 B.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Custom group description field that describes the person attributes in the group, which will be applied to all persons in the group. 
Up to 5 ones can be created. 
Each custom description field can contain 1 to 30 characters. 
The custom description field must be unique in the group. 
Example: if you set the "custom description field" of a group to ["student ID","employee ID","mobile number"], 
then all the persons in the group will have description fields named "student ID", "employee ID", and "mobile number". 
You can enter content in the corresponding field to register a person's student ID, employee ID, and mobile number.
    */
    @SerializedName("GroupExDescriptions")
    @Expose
    private String [] GroupExDescriptions;

    /**
    * Group remarks, which can contain 0 to 40 characters.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Algorithm model version used by the Face Recognition service.

Currently, `2.0` and `3.0` are supported.

This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API, `2.0` will be used by default.

The parameter can be set only to `3.0` for accounts that purchase the service after November 26, 2020.

Different algorithm model versions correspond to different face recognition algorithms. The 3.0 version has a better overall effect than the legacy version and is recommended.
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
     * Get Group name, which is modifiable, must be unique, and can contain 1 to 60 characters. 
     * @return GroupName Group name, which is modifiable, must be unique, and can contain 1 to 60 characters.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Group name, which is modifiable, must be unique, and can contain 1 to 60 characters.
     * @param GroupName Group name, which is modifiable, must be unique, and can contain 1 to 60 characters.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Group ID, which is unmodifiable, must be unique, and can contain letters, digits, and special symbols (-%@#&_) of up to 64 B. 
     * @return GroupId Group ID, which is unmodifiable, must be unique, and can contain letters, digits, and special symbols (-%@#&_) of up to 64 B.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Group ID, which is unmodifiable, must be unique, and can contain letters, digits, and special symbols (-%@#&_) of up to 64 B.
     * @param GroupId Group ID, which is unmodifiable, must be unique, and can contain letters, digits, and special symbols (-%@#&_) of up to 64 B.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Custom group description field that describes the person attributes in the group, which will be applied to all persons in the group. 
Up to 5 ones can be created. 
Each custom description field can contain 1 to 30 characters. 
The custom description field must be unique in the group. 
Example: if you set the "custom description field" of a group to ["student ID","employee ID","mobile number"], 
then all the persons in the group will have description fields named "student ID", "employee ID", and "mobile number". 
You can enter content in the corresponding field to register a person's student ID, employee ID, and mobile number. 
     * @return GroupExDescriptions Custom group description field that describes the person attributes in the group, which will be applied to all persons in the group. 
Up to 5 ones can be created. 
Each custom description field can contain 1 to 30 characters. 
The custom description field must be unique in the group. 
Example: if you set the "custom description field" of a group to ["student ID","employee ID","mobile number"], 
then all the persons in the group will have description fields named "student ID", "employee ID", and "mobile number". 
You can enter content in the corresponding field to register a person's student ID, employee ID, and mobile number.
     */
    public String [] getGroupExDescriptions() {
        return this.GroupExDescriptions;
    }

    /**
     * Set Custom group description field that describes the person attributes in the group, which will be applied to all persons in the group. 
Up to 5 ones can be created. 
Each custom description field can contain 1 to 30 characters. 
The custom description field must be unique in the group. 
Example: if you set the "custom description field" of a group to ["student ID","employee ID","mobile number"], 
then all the persons in the group will have description fields named "student ID", "employee ID", and "mobile number". 
You can enter content in the corresponding field to register a person's student ID, employee ID, and mobile number.
     * @param GroupExDescriptions Custom group description field that describes the person attributes in the group, which will be applied to all persons in the group. 
Up to 5 ones can be created. 
Each custom description field can contain 1 to 30 characters. 
The custom description field must be unique in the group. 
Example: if you set the "custom description field" of a group to ["student ID","employee ID","mobile number"], 
then all the persons in the group will have description fields named "student ID", "employee ID", and "mobile number". 
You can enter content in the corresponding field to register a person's student ID, employee ID, and mobile number.
     */
    public void setGroupExDescriptions(String [] GroupExDescriptions) {
        this.GroupExDescriptions = GroupExDescriptions;
    }

    /**
     * Get Group remarks, which can contain 0 to 40 characters. 
     * @return Tag Group remarks, which can contain 0 to 40 characters.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Group remarks, which can contain 0 to 40 characters.
     * @param Tag Group remarks, which can contain 0 to 40 characters.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Algorithm model version used by the Face Recognition service.

Currently, `2.0` and `3.0` are supported.

This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API, `2.0` will be used by default.

The parameter can be set only to `3.0` for accounts that purchase the service after November 26, 2020.

Different algorithm model versions correspond to different face recognition algorithms. The 3.0 version has a better overall effect than the legacy version and is recommended. 
     * @return FaceModelVersion Algorithm model version used by the Face Recognition service.

Currently, `2.0` and `3.0` are supported.

This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API, `2.0` will be used by default.

The parameter can be set only to `3.0` for accounts that purchase the service after November 26, 2020.

Different algorithm model versions correspond to different face recognition algorithms. The 3.0 version has a better overall effect than the legacy version and is recommended.
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * Set Algorithm model version used by the Face Recognition service.

Currently, `2.0` and `3.0` are supported.

This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API, `2.0` will be used by default.

The parameter can be set only to `3.0` for accounts that purchase the service after November 26, 2020.

Different algorithm model versions correspond to different face recognition algorithms. The 3.0 version has a better overall effect than the legacy version and is recommended.
     * @param FaceModelVersion Algorithm model version used by the Face Recognition service.

Currently, `2.0` and `3.0` are supported.

This parameter is `3.0` by default starting from April 2, 2020. If it is left empty for accounts that used this API, `2.0` will be used by default.

The parameter can be set only to `3.0` for accounts that purchase the service after November 26, 2020.

Different algorithm model versions correspond to different face recognition algorithms. The 3.0 version has a better overall effect than the legacy version and is recommended.
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    public CreateGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGroupRequest(CreateGroupRequest source) {
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

    }
}

