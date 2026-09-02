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

public class DescribeClusterInstallCommandRequest extends AbstractModel {

    /**
    * <p>Whether it is Tencent Cloud. true: use the parallel container daemonset yaml installation branch; false: use the host agent installation command branch</p>
    */
    @SerializedName("IsCloud")
    @Expose
    private Boolean IsCloud;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Network type<br>Enumeration values:<br>basic: basic network<br>private: VPC<br>public: public network<br>direct: direct connect</p>
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * <p>Region code (required when NetType=direct; used by the Tencent Cloud branch for special region mirror repository replacement)</p>
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * <p>VPC ID (required when NetType=direct)<br>Parameter format: in the form of vpc-xxxxxxxx</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Expiration time<br>Parameter format: yyyy-MM-dd (for example, 2026-12-31)<br>Purpose: For the Tencent Cloud branch, it is the expiration time of the cos download link for the daemonset yaml; for the non-Tencent Cloud branch, it is the expiration time of the agent installation token</p>
    */
    @SerializedName("ExpireDate")
    @Expose
    private String ExpireDate;

    /**
    * <p>List of csip tag IDs (for non-Tencent Cloud branches, associate installation tags)</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * <p>Cluster custom parameters (Tencent Cloud branch used for replacing daemonset template placeholders)</p>
    */
    @SerializedName("ClusterCustomParameters")
    @Expose
    private ClusterCustomParameters [] ClusterCustomParameters;

    /**
    * <p>Integration VIP (used by non-Tenant Cloud branches; automatically applied for by the DC service when NetType=direct and Vip is not passed)</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
     * Get <p>Whether it is Tencent Cloud. true: use the parallel container daemonset yaml installation branch; false: use the host agent installation command branch</p> 
     * @return IsCloud <p>Whether it is Tencent Cloud. true: use the parallel container daemonset yaml installation branch; false: use the host agent installation command branch</p>
     */
    public Boolean getIsCloud() {
        return this.IsCloud;
    }

    /**
     * Set <p>Whether it is Tencent Cloud. true: use the parallel container daemonset yaml installation branch; false: use the host agent installation command branch</p>
     * @param IsCloud <p>Whether it is Tencent Cloud. true: use the parallel container daemonset yaml installation branch; false: use the host agent installation command branch</p>
     */
    public void setIsCloud(Boolean IsCloud) {
        this.IsCloud = IsCloud;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Network type<br>Enumeration values:<br>basic: basic network<br>private: VPC<br>public: public network<br>direct: direct connect</p> 
     * @return NetType <p>Network type<br>Enumeration values:<br>basic: basic network<br>private: VPC<br>public: public network<br>direct: direct connect</p>
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set <p>Network type<br>Enumeration values:<br>basic: basic network<br>private: VPC<br>public: public network<br>direct: direct connect</p>
     * @param NetType <p>Network type<br>Enumeration values:<br>basic: basic network<br>private: VPC<br>public: public network<br>direct: direct connect</p>
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get <p>Region code (required when NetType=direct; used by the Tencent Cloud branch for special region mirror repository replacement)</p> 
     * @return RegionCode <p>Region code (required when NetType=direct; used by the Tencent Cloud branch for special region mirror repository replacement)</p>
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set <p>Region code (required when NetType=direct; used by the Tencent Cloud branch for special region mirror repository replacement)</p>
     * @param RegionCode <p>Region code (required when NetType=direct; used by the Tencent Cloud branch for special region mirror repository replacement)</p>
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get <p>VPC ID (required when NetType=direct)<br>Parameter format: in the form of vpc-xxxxxxxx</p> 
     * @return VpcId <p>VPC ID (required when NetType=direct)<br>Parameter format: in the form of vpc-xxxxxxxx</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID (required when NetType=direct)<br>Parameter format: in the form of vpc-xxxxxxxx</p>
     * @param VpcId <p>VPC ID (required when NetType=direct)<br>Parameter format: in the form of vpc-xxxxxxxx</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Expiration time<br>Parameter format: yyyy-MM-dd (for example, 2026-12-31)<br>Purpose: For the Tencent Cloud branch, it is the expiration time of the cos download link for the daemonset yaml; for the non-Tencent Cloud branch, it is the expiration time of the agent installation token</p> 
     * @return ExpireDate <p>Expiration time<br>Parameter format: yyyy-MM-dd (for example, 2026-12-31)<br>Purpose: For the Tencent Cloud branch, it is the expiration time of the cos download link for the daemonset yaml; for the non-Tencent Cloud branch, it is the expiration time of the agent installation token</p>
     */
    public String getExpireDate() {
        return this.ExpireDate;
    }

    /**
     * Set <p>Expiration time<br>Parameter format: yyyy-MM-dd (for example, 2026-12-31)<br>Purpose: For the Tencent Cloud branch, it is the expiration time of the cos download link for the daemonset yaml; for the non-Tencent Cloud branch, it is the expiration time of the agent installation token</p>
     * @param ExpireDate <p>Expiration time<br>Parameter format: yyyy-MM-dd (for example, 2026-12-31)<br>Purpose: For the Tencent Cloud branch, it is the expiration time of the cos download link for the daemonset yaml; for the non-Tencent Cloud branch, it is the expiration time of the agent installation token</p>
     */
    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    /**
     * Get <p>List of csip tag IDs (for non-Tencent Cloud branches, associate installation tags)</p> 
     * @return TagIds <p>List of csip tag IDs (for non-Tencent Cloud branches, associate installation tags)</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>List of csip tag IDs (for non-Tencent Cloud branches, associate installation tags)</p>
     * @param TagIds <p>List of csip tag IDs (for non-Tencent Cloud branches, associate installation tags)</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>Cluster custom parameters (Tencent Cloud branch used for replacing daemonset template placeholders)</p> 
     * @return ClusterCustomParameters <p>Cluster custom parameters (Tencent Cloud branch used for replacing daemonset template placeholders)</p>
     */
    public ClusterCustomParameters [] getClusterCustomParameters() {
        return this.ClusterCustomParameters;
    }

    /**
     * Set <p>Cluster custom parameters (Tencent Cloud branch used for replacing daemonset template placeholders)</p>
     * @param ClusterCustomParameters <p>Cluster custom parameters (Tencent Cloud branch used for replacing daemonset template placeholders)</p>
     */
    public void setClusterCustomParameters(ClusterCustomParameters [] ClusterCustomParameters) {
        this.ClusterCustomParameters = ClusterCustomParameters;
    }

    /**
     * Get <p>Integration VIP (used by non-Tenant Cloud branches; automatically applied for by the DC service when NetType=direct and Vip is not passed)</p> 
     * @return Vip <p>Integration VIP (used by non-Tenant Cloud branches; automatically applied for by the DC service when NetType=direct and Vip is not passed)</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>Integration VIP (used by non-Tenant Cloud branches; automatically applied for by the DC service when NetType=direct and Vip is not passed)</p>
     * @param Vip <p>Integration VIP (used by non-Tenant Cloud branches; automatically applied for by the DC service when NetType=direct and Vip is not passed)</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    public DescribeClusterInstallCommandRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterInstallCommandRequest(DescribeClusterInstallCommandRequest source) {
        if (source.IsCloud != null) {
            this.IsCloud = new Boolean(source.IsCloud);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ExpireDate != null) {
            this.ExpireDate = new String(source.ExpireDate);
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
        if (source.ClusterCustomParameters != null) {
            this.ClusterCustomParameters = new ClusterCustomParameters[source.ClusterCustomParameters.length];
            for (int i = 0; i < source.ClusterCustomParameters.length; i++) {
                this.ClusterCustomParameters[i] = new ClusterCustomParameters(source.ClusterCustomParameters[i]);
            }
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsCloud", this.IsCloud);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ExpireDate", this.ExpireDate);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArrayObj(map, prefix + "ClusterCustomParameters.", this.ClusterCustomParameters);
        this.setParamSimple(map, prefix + "Vip", this.Vip);

    }
}

