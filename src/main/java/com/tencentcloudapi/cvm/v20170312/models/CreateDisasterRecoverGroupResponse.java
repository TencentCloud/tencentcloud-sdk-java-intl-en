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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDisasterRecoverGroupResponse extends AbstractModel{

    /**
    * List of spread placement group IDs.
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * Type of the spread placement group. Valid values: <br><li>HOST: physical machine <br><li>SW: switch <br><li>RACK: rack.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Name of the spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The maximum number of CVMs in a placement group.
    */
    @SerializedName("CvmQuotaTotal")
    @Expose
    private Long CvmQuotaTotal;

    /**
    * The current number of CVMs in a placement group.
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * Creation time of the placement group.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of spread placement group IDs. 
     * @return DisasterRecoverGroupId List of spread placement group IDs.
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set List of spread placement group IDs.
     * @param DisasterRecoverGroupId List of spread placement group IDs.
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get Type of the spread placement group. Valid values: <br><li>HOST: physical machine <br><li>SW: switch <br><li>RACK: rack. 
     * @return Type Type of the spread placement group. Valid values: <br><li>HOST: physical machine <br><li>SW: switch <br><li>RACK: rack.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the spread placement group. Valid values: <br><li>HOST: physical machine <br><li>SW: switch <br><li>RACK: rack.
     * @param Type Type of the spread placement group. Valid values: <br><li>HOST: physical machine <br><li>SW: switch <br><li>RACK: rack.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Name of the spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters. 
     * @return Name Name of the spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
     * @param Name Name of the spread placement group. The name must be 1-60 characters long and can contain both Chinese characters and English letters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The maximum number of CVMs in a placement group. 
     * @return CvmQuotaTotal The maximum number of CVMs in a placement group.
     */
    public Long getCvmQuotaTotal() {
        return this.CvmQuotaTotal;
    }

    /**
     * Set The maximum number of CVMs in a placement group.
     * @param CvmQuotaTotal The maximum number of CVMs in a placement group.
     */
    public void setCvmQuotaTotal(Long CvmQuotaTotal) {
        this.CvmQuotaTotal = CvmQuotaTotal;
    }

    /**
     * Get The current number of CVMs in a placement group. 
     * @return CurrentNum The current number of CVMs in a placement group.
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set The current number of CVMs in a placement group.
     * @param CurrentNum The current number of CVMs in a placement group.
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get Creation time of the placement group. 
     * @return CreateTime Creation time of the placement group.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of the placement group.
     * @param CreateTime Creation time of the placement group.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateDisasterRecoverGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDisasterRecoverGroupResponse(CreateDisasterRecoverGroupResponse source) {
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CvmQuotaTotal != null) {
            this.CvmQuotaTotal = new Long(source.CvmQuotaTotal);
        }
        if (source.CurrentNum != null) {
            this.CurrentNum = new Long(source.CurrentNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CvmQuotaTotal", this.CvmQuotaTotal);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

