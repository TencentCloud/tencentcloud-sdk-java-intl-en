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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisasterRecoverGroup extends AbstractModel {

    /**
    * ID of a spread placement group.
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * Name of a spread placement group, which must be 1-60 characters long.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Type of a spread placement group. Valid values:<br>
<li>HOST: physical machine.<br></li>
<li>SW: switch.<br></li>
<li>RACK: rack.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The maximum number of CVMs that can be hosted in a spread placement group.
    */
    @SerializedName("CvmQuotaTotal")
    @Expose
    private Long CvmQuotaTotal;

    /**
    * The current number of CVMs in a spread placement group.
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * The list of CVM IDs in a spread placement group.
Note: This field may return null, indicating that no valid value was found.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Creation time of a spread placement group.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get ID of a spread placement group. 
     * @return DisasterRecoverGroupId ID of a spread placement group.
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set ID of a spread placement group.
     * @param DisasterRecoverGroupId ID of a spread placement group.
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get Name of a spread placement group, which must be 1-60 characters long. 
     * @return Name Name of a spread placement group, which must be 1-60 characters long.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of a spread placement group, which must be 1-60 characters long.
     * @param Name Name of a spread placement group, which must be 1-60 characters long.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Type of a spread placement group. Valid values:<br>
<li>HOST: physical machine.<br></li>
<li>SW: switch.<br></li>
<li>RACK: rack.</li> 
     * @return Type Type of a spread placement group. Valid values:<br>
<li>HOST: physical machine.<br></li>
<li>SW: switch.<br></li>
<li>RACK: rack.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of a spread placement group. Valid values:<br>
<li>HOST: physical machine.<br></li>
<li>SW: switch.<br></li>
<li>RACK: rack.</li>
     * @param Type Type of a spread placement group. Valid values:<br>
<li>HOST: physical machine.<br></li>
<li>SW: switch.<br></li>
<li>RACK: rack.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The maximum number of CVMs that can be hosted in a spread placement group. 
     * @return CvmQuotaTotal The maximum number of CVMs that can be hosted in a spread placement group.
     */
    public Long getCvmQuotaTotal() {
        return this.CvmQuotaTotal;
    }

    /**
     * Set The maximum number of CVMs that can be hosted in a spread placement group.
     * @param CvmQuotaTotal The maximum number of CVMs that can be hosted in a spread placement group.
     */
    public void setCvmQuotaTotal(Long CvmQuotaTotal) {
        this.CvmQuotaTotal = CvmQuotaTotal;
    }

    /**
     * Get The current number of CVMs in a spread placement group. 
     * @return CurrentNum The current number of CVMs in a spread placement group.
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set The current number of CVMs in a spread placement group.
     * @param CurrentNum The current number of CVMs in a spread placement group.
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get The list of CVM IDs in a spread placement group.
Note: This field may return null, indicating that no valid value was found. 
     * @return InstanceIds The list of CVM IDs in a spread placement group.
Note: This field may return null, indicating that no valid value was found.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set The list of CVM IDs in a spread placement group.
Note: This field may return null, indicating that no valid value was found.
     * @param InstanceIds The list of CVM IDs in a spread placement group.
Note: This field may return null, indicating that no valid value was found.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Creation time of a spread placement group.
Note: This field may return null, indicating that no valid value is found. 
     * @return CreateTime Creation time of a spread placement group.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of a spread placement group.
Note: This field may return null, indicating that no valid value is found.
     * @param CreateTime Creation time of a spread placement group.
Note: This field may return null, indicating that no valid value is found.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public DisasterRecoverGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisasterRecoverGroup(DisasterRecoverGroup source) {
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CvmQuotaTotal != null) {
            this.CvmQuotaTotal = new Long(source.CvmQuotaTotal);
        }
        if (source.CurrentNum != null) {
            this.CurrentNum = new Long(source.CurrentNum);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CvmQuotaTotal", this.CvmQuotaTotal);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

