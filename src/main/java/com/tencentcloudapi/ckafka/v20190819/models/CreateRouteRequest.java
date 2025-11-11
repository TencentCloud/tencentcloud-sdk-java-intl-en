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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRouteRequest extends AbstractModel {

    /**
    * <p>Specifies the ckafka cluster instance id. obtain through the API <a href="https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a>.</p>.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <P>Specifies the network type of the route (3: vpc routing; 7: internal support route; 1: public network route).</p>.
    */
    @SerializedName("VipType")
    @Expose
    private Long VipType;

    /**
    * <p>vpc network Id. required when vipType is 3.</p>.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>Specifies the vpc subnet id. required when vipType is 3.</p>.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>Access type: 0-plaintext; 1-sasl_plaintext; 3-sasl_ssl; 4-sasl_scram_sha_256; 5-sasl_scram_sha_512. defaults to 0. when vipType=3, supports 0,1,3,4,5. when vipType=7, supports 0,1,3. when vipType=1, supports 1,3.</p>.
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * <P>Specifies whether access management is required. this field has been deprecated.</p>.
    */
    @SerializedName("AuthFlag")
    @Expose
    private Long AuthFlag;

    /**
    * <p>Specifies the caller appId.</p>.
    */
    @SerializedName("CallerAppid")
    @Expose
    private Long CallerAppid;

    /**
    * <P>Public network bandwidth. required for public network route. must be a multiple of 3. no default value.</p>.
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Long PublicNetwork;

    /**
    * <p>vip address.</p>.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <P>Specifies the remark information.</p>.
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <P>Specifies the ordered list of security group associations.</p>.
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * Get <p>Specifies the ckafka cluster instance id. obtain through the API <a href="https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a>.</p>. 
     * @return InstanceId <p>Specifies the ckafka cluster instance id. obtain through the API <a href="https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a>.</p>.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specifies the ckafka cluster instance id. obtain through the API <a href="https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a>.</p>.
     * @param InstanceId <p>Specifies the ckafka cluster instance id. obtain through the API <a href="https://www.tencentcloud.comom/document/product/597/40835?from_cn_redirect=1">DescribeInstances</a>.</p>.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <P>Specifies the network type of the route (3: vpc routing; 7: internal support route; 1: public network route).</p>. 
     * @return VipType <P>Specifies the network type of the route (3: vpc routing; 7: internal support route; 1: public network route).</p>.
     */
    public Long getVipType() {
        return this.VipType;
    }

    /**
     * Set <P>Specifies the network type of the route (3: vpc routing; 7: internal support route; 1: public network route).</p>.
     * @param VipType <P>Specifies the network type of the route (3: vpc routing; 7: internal support route; 1: public network route).</p>.
     */
    public void setVipType(Long VipType) {
        this.VipType = VipType;
    }

    /**
     * Get <p>vpc network Id. required when vipType is 3.</p>. 
     * @return VpcId <p>vpc network Id. required when vipType is 3.</p>.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>vpc network Id. required when vipType is 3.</p>.
     * @param VpcId <p>vpc network Id. required when vipType is 3.</p>.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>Specifies the vpc subnet id. required when vipType is 3.</p>. 
     * @return SubnetId <p>Specifies the vpc subnet id. required when vipType is 3.</p>.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>Specifies the vpc subnet id. required when vipType is 3.</p>.
     * @param SubnetId <p>Specifies the vpc subnet id. required when vipType is 3.</p>.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>Access type: 0-plaintext; 1-sasl_plaintext; 3-sasl_ssl; 4-sasl_scram_sha_256; 5-sasl_scram_sha_512. defaults to 0. when vipType=3, supports 0,1,3,4,5. when vipType=7, supports 0,1,3. when vipType=1, supports 1,3.</p>. 
     * @return AccessType <p>Access type: 0-plaintext; 1-sasl_plaintext; 3-sasl_ssl; 4-sasl_scram_sha_256; 5-sasl_scram_sha_512. defaults to 0. when vipType=3, supports 0,1,3,4,5. when vipType=7, supports 0,1,3. when vipType=1, supports 1,3.</p>.
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set <p>Access type: 0-plaintext; 1-sasl_plaintext; 3-sasl_ssl; 4-sasl_scram_sha_256; 5-sasl_scram_sha_512. defaults to 0. when vipType=3, supports 0,1,3,4,5. when vipType=7, supports 0,1,3. when vipType=1, supports 1,3.</p>.
     * @param AccessType <p>Access type: 0-plaintext; 1-sasl_plaintext; 3-sasl_ssl; 4-sasl_scram_sha_256; 5-sasl_scram_sha_512. defaults to 0. when vipType=3, supports 0,1,3,4,5. when vipType=7, supports 0,1,3. when vipType=1, supports 1,3.</p>.
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get <P>Specifies whether access management is required. this field has been deprecated.</p>. 
     * @return AuthFlag <P>Specifies whether access management is required. this field has been deprecated.</p>.
     */
    public Long getAuthFlag() {
        return this.AuthFlag;
    }

    /**
     * Set <P>Specifies whether access management is required. this field has been deprecated.</p>.
     * @param AuthFlag <P>Specifies whether access management is required. this field has been deprecated.</p>.
     */
    public void setAuthFlag(Long AuthFlag) {
        this.AuthFlag = AuthFlag;
    }

    /**
     * Get <p>Specifies the caller appId.</p>. 
     * @return CallerAppid <p>Specifies the caller appId.</p>.
     */
    public Long getCallerAppid() {
        return this.CallerAppid;
    }

    /**
     * Set <p>Specifies the caller appId.</p>.
     * @param CallerAppid <p>Specifies the caller appId.</p>.
     */
    public void setCallerAppid(Long CallerAppid) {
        this.CallerAppid = CallerAppid;
    }

    /**
     * Get <P>Public network bandwidth. required for public network route. must be a multiple of 3. no default value.</p>. 
     * @return PublicNetwork <P>Public network bandwidth. required for public network route. must be a multiple of 3. no default value.</p>.
     */
    public Long getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set <P>Public network bandwidth. required for public network route. must be a multiple of 3. no default value.</p>.
     * @param PublicNetwork <P>Public network bandwidth. required for public network route. must be a multiple of 3. no default value.</p>.
     */
    public void setPublicNetwork(Long PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get <p>vip address.</p>. 
     * @return Ip <p>vip address.</p>.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>vip address.</p>.
     * @param Ip <p>vip address.</p>.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <P>Specifies the remark information.</p>. 
     * @return Note <P>Specifies the remark information.</p>.
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <P>Specifies the remark information.</p>.
     * @param Note <P>Specifies the remark information.</p>.
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <P>Specifies the ordered list of security group associations.</p>. 
     * @return SecurityGroupIds <P>Specifies the ordered list of security group associations.</p>.
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set <P>Specifies the ordered list of security group associations.</p>.
     * @param SecurityGroupIds <P>Specifies the ordered list of security group associations.</p>.
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    public CreateRouteRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRouteRequest(CreateRouteRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VipType != null) {
            this.VipType = new Long(source.VipType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.AuthFlag != null) {
            this.AuthFlag = new Long(source.AuthFlag);
        }
        if (source.CallerAppid != null) {
            this.CallerAppid = new Long(source.CallerAppid);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Long(source.PublicNetwork);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VipType", this.VipType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AuthFlag", this.AuthFlag);
        this.setParamSimple(map, prefix + "CallerAppid", this.CallerAppid);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

