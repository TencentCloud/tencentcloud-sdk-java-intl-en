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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIp extends AbstractModel {

    /**
    * IP address
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * ip type. public: public network; private: private network
    */
    @SerializedName("IpType")
    @Expose
    private String IpType;

    /**
    * ip tag information
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether it has been tagged with information
    */
    @SerializedName("IsRemarked")
    @Expose
    private Long IsRemarked;

    /**
    * ip belongs to the instance id
    */
    @SerializedName("ResourceInstanceId")
    @Expose
    private String ResourceInstanceId;

    /**
    * ip-associated product
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * ip region
    */
    @SerializedName("Area")
    @Expose
    private DspmArea Area;

    /**
    * Whether it is a new ip address
    */
    @SerializedName("IsNewIp")
    @Expose
    private Long IsNewIp;

    /**
     * Get IP address 
     * @return Ip IP address
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address
     * @param Ip IP address
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get ip type. public: public network; private: private network 
     * @return IpType ip type. public: public network; private: private network
     */
    public String getIpType() {
        return this.IpType;
    }

    /**
     * Set ip type. public: public network; private: private network
     * @param IpType ip type. public: public network; private: private network
     */
    public void setIpType(String IpType) {
        this.IpType = IpType;
    }

    /**
     * Get ip tag information 
     * @return Remark ip tag information
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set ip tag information
     * @param Remark ip tag information
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Whether it has been tagged with information 
     * @return IsRemarked Whether it has been tagged with information
     */
    public Long getIsRemarked() {
        return this.IsRemarked;
    }

    /**
     * Set Whether it has been tagged with information
     * @param IsRemarked Whether it has been tagged with information
     */
    public void setIsRemarked(Long IsRemarked) {
        this.IsRemarked = IsRemarked;
    }

    /**
     * Get ip belongs to the instance id 
     * @return ResourceInstanceId ip belongs to the instance id
     */
    public String getResourceInstanceId() {
        return this.ResourceInstanceId;
    }

    /**
     * Set ip belongs to the instance id
     * @param ResourceInstanceId ip belongs to the instance id
     */
    public void setResourceInstanceId(String ResourceInstanceId) {
        this.ResourceInstanceId = ResourceInstanceId;
    }

    /**
     * Get ip-associated product 
     * @return ResourceType ip-associated product
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set ip-associated product
     * @param ResourceType ip-associated product
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get ip region 
     * @return Area ip region
     */
    public DspmArea getArea() {
        return this.Area;
    }

    /**
     * Set ip region
     * @param Area ip region
     */
    public void setArea(DspmArea Area) {
        this.Area = Area;
    }

    /**
     * Get Whether it is a new ip address 
     * @return IsNewIp Whether it is a new ip address
     */
    public Long getIsNewIp() {
        return this.IsNewIp;
    }

    /**
     * Set Whether it is a new ip address
     * @param IsNewIp Whether it is a new ip address
     */
    public void setIsNewIp(Long IsNewIp) {
        this.IsNewIp = IsNewIp;
    }

    public DspmIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIp(DspmIp source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.IpType != null) {
            this.IpType = new String(source.IpType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IsRemarked != null) {
            this.IsRemarked = new Long(source.IsRemarked);
        }
        if (source.ResourceInstanceId != null) {
            this.ResourceInstanceId = new String(source.ResourceInstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Area != null) {
            this.Area = new DspmArea(source.Area);
        }
        if (source.IsNewIp != null) {
            this.IsNewIp = new Long(source.IsNewIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "IpType", this.IpType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsRemarked", this.IsRemarked);
        this.setParamSimple(map, prefix + "ResourceInstanceId", this.ResourceInstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "Area.", this.Area);
        this.setParamSimple(map, prefix + "IsNewIp", this.IsNewIp);

    }
}

