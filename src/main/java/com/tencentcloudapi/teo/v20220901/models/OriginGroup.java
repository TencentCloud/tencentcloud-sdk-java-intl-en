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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginGroup extends AbstractModel {

    /**
    * 
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Records")
    @Expose
    private OriginRecord [] Records;

    /**
    * 
    */
    @SerializedName("References")
    @Expose
    private OriginGroupReference [] References;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The update time of the origin group.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Origin-pull host header
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
     * Get  
     * @return GroupId 
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 
     * @param GroupId 
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Records 
     */
    public OriginRecord [] getRecords() {
        return this.Records;
    }

    /**
     * Set 
     * @param Records 
     */
    public void setRecords(OriginRecord [] Records) {
        this.Records = Records;
    }

    /**
     * Get  
     * @return References 
     */
    public OriginGroupReference [] getReferences() {
        return this.References;
    }

    /**
     * Set 
     * @param References 
     */
    public void setReferences(OriginGroupReference [] References) {
        this.References = References;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The update time of the origin group. 
     * @return UpdateTime The update time of the origin group.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set The update time of the origin group.
     * @param UpdateTime The update time of the origin group.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Origin-pull host header
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return HostHeader Origin-pull host header
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set Origin-pull host header
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param HostHeader Origin-pull host header
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setHostHeader(String HostHeader) {
        this.HostHeader = HostHeader;
    }

    public OriginGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginGroup(OriginGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Records != null) {
            this.Records = new OriginRecord[source.Records.length];
            for (int i = 0; i < source.Records.length; i++) {
                this.Records[i] = new OriginRecord(source.Records[i]);
            }
        }
        if (source.References != null) {
            this.References = new OriginGroupReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new OriginGroupReference(source.References[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HostHeader != null) {
            this.HostHeader = new String(source.HostHeader);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Records.", this.Records);
        this.setParamArrayObj(map, prefix + "References.", this.References);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HostHeader", this.HostHeader);

    }
}

