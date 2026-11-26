/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
    * Origin server group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Origin server group name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Origin server group type. Valid values:
<li>GENERAL: general origin group;</li>
<li>HTTP: HTTP-specific origin group.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Origin server record information.
    */
    @SerializedName("Records")
    @Expose
    private OriginRecord [] Records;

    /**
    * List of instances that reference the origin group.	
    */
    @SerializedName("References")
    @Expose
    private OriginGroupReference [] References;

    /**
    * Origin group creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Origin-pull group update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Origin-pull Host Header.
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
     * Get Origin server group ID. 
     * @return GroupId Origin server group ID.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Origin server group ID.
     * @param GroupId Origin server group ID.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Origin server group name. 
     * @return Name Origin server group name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Origin server group name.
     * @param Name Origin server group name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Origin server group type. Valid values:
<li>GENERAL: general origin group;</li>
<li>HTTP: HTTP-specific origin group.</li> 
     * @return Type Origin server group type. Valid values:
<li>GENERAL: general origin group;</li>
<li>HTTP: HTTP-specific origin group.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Origin server group type. Valid values:
<li>GENERAL: general origin group;</li>
<li>HTTP: HTTP-specific origin group.</li>
     * @param Type Origin server group type. Valid values:
<li>GENERAL: general origin group;</li>
<li>HTTP: HTTP-specific origin group.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Origin server record information. 
     * @return Records Origin server record information.
     */
    public OriginRecord [] getRecords() {
        return this.Records;
    }

    /**
     * Set Origin server record information.
     * @param Records Origin server record information.
     */
    public void setRecords(OriginRecord [] Records) {
        this.Records = Records;
    }

    /**
     * Get List of instances that reference the origin group.	 
     * @return References List of instances that reference the origin group.	
     */
    public OriginGroupReference [] getReferences() {
        return this.References;
    }

    /**
     * Set List of instances that reference the origin group.	
     * @param References List of instances that reference the origin group.	
     */
    public void setReferences(OriginGroupReference [] References) {
        this.References = References;
    }

    /**
     * Get Origin group creation time. 
     * @return CreateTime Origin group creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Origin group creation time.
     * @param CreateTime Origin group creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Origin-pull group update time. 
     * @return UpdateTime Origin-pull group update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Origin-pull group update time.
     * @param UpdateTime Origin-pull group update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Origin-pull Host Header. 
     * @return HostHeader Origin-pull Host Header.
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set Origin-pull Host Header.
     * @param HostHeader Origin-pull Host Header.
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

