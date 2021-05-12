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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCfsPGroupResponse extends AbstractModel{

    /**
    * Permission group ID
    */
    @SerializedName("PGroupId")
    @Expose
    private String PGroupId;

    /**
    * Permission group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Permission group description
    */
    @SerializedName("DescInfo")
    @Expose
    private String DescInfo;

    /**
    * The number of file systems bound to this permission group
    */
    @SerializedName("BindCfsNum")
    @Expose
    private Long BindCfsNum;

    /**
    * Permission group creation time
    */
    @SerializedName("CDate")
    @Expose
    private String CDate;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Permission group ID 
     * @return PGroupId Permission group ID
     */
    public String getPGroupId() {
        return this.PGroupId;
    }

    /**
     * Set Permission group ID
     * @param PGroupId Permission group ID
     */
    public void setPGroupId(String PGroupId) {
        this.PGroupId = PGroupId;
    }

    /**
     * Get Permission group name 
     * @return Name Permission group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Permission group name
     * @param Name Permission group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Permission group description 
     * @return DescInfo Permission group description
     */
    public String getDescInfo() {
        return this.DescInfo;
    }

    /**
     * Set Permission group description
     * @param DescInfo Permission group description
     */
    public void setDescInfo(String DescInfo) {
        this.DescInfo = DescInfo;
    }

    /**
     * Get The number of file systems bound to this permission group 
     * @return BindCfsNum The number of file systems bound to this permission group
     */
    public Long getBindCfsNum() {
        return this.BindCfsNum;
    }

    /**
     * Set The number of file systems bound to this permission group
     * @param BindCfsNum The number of file systems bound to this permission group
     */
    public void setBindCfsNum(Long BindCfsNum) {
        this.BindCfsNum = BindCfsNum;
    }

    /**
     * Get Permission group creation time 
     * @return CDate Permission group creation time
     */
    public String getCDate() {
        return this.CDate;
    }

    /**
     * Set Permission group creation time
     * @param CDate Permission group creation time
     */
    public void setCDate(String CDate) {
        this.CDate = CDate;
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

    public CreateCfsPGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCfsPGroupResponse(CreateCfsPGroupResponse source) {
        if (source.PGroupId != null) {
            this.PGroupId = new String(source.PGroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DescInfo != null) {
            this.DescInfo = new String(source.DescInfo);
        }
        if (source.BindCfsNum != null) {
            this.BindCfsNum = new Long(source.BindCfsNum);
        }
        if (source.CDate != null) {
            this.CDate = new String(source.CDate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PGroupId", this.PGroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DescInfo", this.DescInfo);
        this.setParamSimple(map, prefix + "BindCfsNum", this.BindCfsNum);
        this.setParamSimple(map, prefix + "CDate", this.CDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

