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

public class DescribeDisasterRecoverGroupQuotaResponse extends AbstractModel{

    /**
    * The maximum number of placement groups that can be created.
    */
    @SerializedName("GroupQuota")
    @Expose
    private Long GroupQuota;

    /**
    * The number of placement groups that have been created by the current user.
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * Quota on instances in a physical-machine-type disaster recovery group.
    */
    @SerializedName("CvmInHostGroupQuota")
    @Expose
    private Long CvmInHostGroupQuota;

    /**
    * Quota on instances in a switch-type disaster recovery group.
    */
    @SerializedName("CvmInSwGroupQuota")
    @Expose
    private Long CvmInSwGroupQuota;

    /**
    * Quota on instances in a rack-type disaster recovery group.
    */
    @SerializedName("CvmInRackGroupQuota")
    @Expose
    private Long CvmInRackGroupQuota;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The maximum number of placement groups that can be created. 
     * @return GroupQuota The maximum number of placement groups that can be created.
     */
    public Long getGroupQuota() {
        return this.GroupQuota;
    }

    /**
     * Set The maximum number of placement groups that can be created.
     * @param GroupQuota The maximum number of placement groups that can be created.
     */
    public void setGroupQuota(Long GroupQuota) {
        this.GroupQuota = GroupQuota;
    }

    /**
     * Get The number of placement groups that have been created by the current user. 
     * @return CurrentNum The number of placement groups that have been created by the current user.
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set The number of placement groups that have been created by the current user.
     * @param CurrentNum The number of placement groups that have been created by the current user.
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get Quota on instances in a physical-machine-type disaster recovery group. 
     * @return CvmInHostGroupQuota Quota on instances in a physical-machine-type disaster recovery group.
     */
    public Long getCvmInHostGroupQuota() {
        return this.CvmInHostGroupQuota;
    }

    /**
     * Set Quota on instances in a physical-machine-type disaster recovery group.
     * @param CvmInHostGroupQuota Quota on instances in a physical-machine-type disaster recovery group.
     */
    public void setCvmInHostGroupQuota(Long CvmInHostGroupQuota) {
        this.CvmInHostGroupQuota = CvmInHostGroupQuota;
    }

    /**
     * Get Quota on instances in a switch-type disaster recovery group. 
     * @return CvmInSwGroupQuota Quota on instances in a switch-type disaster recovery group.
     */
    public Long getCvmInSwGroupQuota() {
        return this.CvmInSwGroupQuota;
    }

    /**
     * Set Quota on instances in a switch-type disaster recovery group.
     * @param CvmInSwGroupQuota Quota on instances in a switch-type disaster recovery group.
     */
    public void setCvmInSwGroupQuota(Long CvmInSwGroupQuota) {
        this.CvmInSwGroupQuota = CvmInSwGroupQuota;
    }

    /**
     * Get Quota on instances in a rack-type disaster recovery group. 
     * @return CvmInRackGroupQuota Quota on instances in a rack-type disaster recovery group.
     */
    public Long getCvmInRackGroupQuota() {
        return this.CvmInRackGroupQuota;
    }

    /**
     * Set Quota on instances in a rack-type disaster recovery group.
     * @param CvmInRackGroupQuota Quota on instances in a rack-type disaster recovery group.
     */
    public void setCvmInRackGroupQuota(Long CvmInRackGroupQuota) {
        this.CvmInRackGroupQuota = CvmInRackGroupQuota;
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

    public DescribeDisasterRecoverGroupQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDisasterRecoverGroupQuotaResponse(DescribeDisasterRecoverGroupQuotaResponse source) {
        if (source.GroupQuota != null) {
            this.GroupQuota = new Long(source.GroupQuota);
        }
        if (source.CurrentNum != null) {
            this.CurrentNum = new Long(source.CurrentNum);
        }
        if (source.CvmInHostGroupQuota != null) {
            this.CvmInHostGroupQuota = new Long(source.CvmInHostGroupQuota);
        }
        if (source.CvmInSwGroupQuota != null) {
            this.CvmInSwGroupQuota = new Long(source.CvmInSwGroupQuota);
        }
        if (source.CvmInRackGroupQuota != null) {
            this.CvmInRackGroupQuota = new Long(source.CvmInRackGroupQuota);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupQuota", this.GroupQuota);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "CvmInHostGroupQuota", this.CvmInHostGroupQuota);
        this.setParamSimple(map, prefix + "CvmInSwGroupQuota", this.CvmInSwGroupQuota);
        this.setParamSimple(map, prefix + "CvmInRackGroupQuota", this.CvmInRackGroupQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

