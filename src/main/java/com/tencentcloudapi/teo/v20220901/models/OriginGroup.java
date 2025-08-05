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
    * The ID of the origin group.
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * The name of the origin group.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The origin group type. Values:
<li>`GENERAL`: General origin group</li>
<li>`HTTP`: HTTP-specific origin group</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Details of the origin record.
    */
    @SerializedName("Records")
    @Expose
    private OriginRecord [] Records;

    /**
    * List of instances referencing this origin group.	
    */
    @SerializedName("References")
    @Expose
    private OriginGroupReference [] References;

    /**
    * Creation time of the origin group.
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
    * Specifies the origin-pull Host Header.
    */
    @SerializedName("HostHeader")
    @Expose
    private String HostHeader;

    /**
     * Get The ID of the origin group. 
     * @return GroupId The ID of the origin group.
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The ID of the origin group.
     * @param GroupId The ID of the origin group.
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get The name of the origin group. 
     * @return Name The name of the origin group.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The name of the origin group.
     * @param Name The name of the origin group.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The origin group type. Values:
<li>`GENERAL`: General origin group</li>
<li>`HTTP`: HTTP-specific origin group</li> 
     * @return Type The origin group type. Values:
<li>`GENERAL`: General origin group</li>
<li>`HTTP`: HTTP-specific origin group</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The origin group type. Values:
<li>`GENERAL`: General origin group</li>
<li>`HTTP`: HTTP-specific origin group</li>
     * @param Type The origin group type. Values:
<li>`GENERAL`: General origin group</li>
<li>`HTTP`: HTTP-specific origin group</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Details of the origin record. 
     * @return Records Details of the origin record.
     */
    public OriginRecord [] getRecords() {
        return this.Records;
    }

    /**
     * Set Details of the origin record.
     * @param Records Details of the origin record.
     */
    public void setRecords(OriginRecord [] Records) {
        this.Records = Records;
    }

    /**
     * Get List of instances referencing this origin group.	 
     * @return References List of instances referencing this origin group.	
     */
    public OriginGroupReference [] getReferences() {
        return this.References;
    }

    /**
     * Set List of instances referencing this origin group.	
     * @param References List of instances referencing this origin group.	
     */
    public void setReferences(OriginGroupReference [] References) {
        this.References = References;
    }

    /**
     * Get Creation time of the origin group. 
     * @return CreateTime Creation time of the origin group.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the origin group.
     * @param CreateTime Creation time of the origin group.
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
     * Get Specifies the origin-pull Host Header. 
     * @return HostHeader Specifies the origin-pull Host Header.
     */
    public String getHostHeader() {
        return this.HostHeader;
    }

    /**
     * Set Specifies the origin-pull Host Header.
     * @param HostHeader Specifies the origin-pull Host Header.
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

