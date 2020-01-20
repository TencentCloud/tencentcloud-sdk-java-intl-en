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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpnGateway extends AbstractModel{

    /**
    * Gateway instance ID.
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * VPC instance ID.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Gateway instance name.
    */
    @SerializedName("VpnGatewayName")
    @Expose
    private String VpnGatewayName;

    /**
    * Gateway instance type: 'IPSEC' and 'SSL'.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Gateway instance status. 'PENDING': Creating; 'DELETING': Deleting; 'AVAILABLE': Running.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Gateway public IP.
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * Gateway renewal type: 'NOTIFY_AND_MANUAL_RENEW': Manual renewal. 'NOTIFY_AND_AUTO_RENEW': Automatic renewal. 'NOT_NOTIFY_AND_NOT_RENEW': No renewal after expiration.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Gateway billing type: POSTPAID_BY_HOUR: Postpaid by hour; PREPAID: Prepaid.
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Outbound bandwidth of gateway.
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Expiration time of the prepaid gateway.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Whether the public IP is blocked.
    */
    @SerializedName("IsAddressBlocked")
    @Expose
    private Boolean IsAddressBlocked;

    /**
    * Change of billing method. PREPAID_TO_POSTPAID: Monthly subscription prepaid to postpaid by hour.
    */
    @SerializedName("NewPurchasePlan")
    @Expose
    private String NewPurchasePlan;

    /**
    * Gateway billing status. PROTECTIVELY_ISOLATED: Instance is isolated; NORMAL: Normal.
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * The availability zone, such as `ap-guangzhou-2`
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Gateway bandwidth quota information.
    */
    @SerializedName("VpnGatewayQuotaSet")
    @Expose
    private VpnGatewayQuota [] VpnGatewayQuotaSet;

    /**
     * Get Gateway instance ID. 
     * @return VpnGatewayId Gateway instance ID.
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * Set Gateway instance ID.
     * @param VpnGatewayId Gateway instance ID.
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * Get VPC instance ID. 
     * @return VpcId VPC instance ID.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID.
     * @param VpcId VPC instance ID.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Gateway instance name. 
     * @return VpnGatewayName Gateway instance name.
     */
    public String getVpnGatewayName() {
        return this.VpnGatewayName;
    }

    /**
     * Set Gateway instance name.
     * @param VpnGatewayName Gateway instance name.
     */
    public void setVpnGatewayName(String VpnGatewayName) {
        this.VpnGatewayName = VpnGatewayName;
    }

    /**
     * Get Gateway instance type: 'IPSEC' and 'SSL'. 
     * @return Type Gateway instance type: 'IPSEC' and 'SSL'.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Gateway instance type: 'IPSEC' and 'SSL'.
     * @param Type Gateway instance type: 'IPSEC' and 'SSL'.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Gateway instance status. 'PENDING': Creating; 'DELETING': Deleting; 'AVAILABLE': Running. 
     * @return State Gateway instance status. 'PENDING': Creating; 'DELETING': Deleting; 'AVAILABLE': Running.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Gateway instance status. 'PENDING': Creating; 'DELETING': Deleting; 'AVAILABLE': Running.
     * @param State Gateway instance status. 'PENDING': Creating; 'DELETING': Deleting; 'AVAILABLE': Running.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Gateway public IP. 
     * @return PublicIpAddress Gateway public IP.
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set Gateway public IP.
     * @param PublicIpAddress Gateway public IP.
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get Gateway renewal type: 'NOTIFY_AND_MANUAL_RENEW': Manual renewal. 'NOTIFY_AND_AUTO_RENEW': Automatic renewal. 'NOT_NOTIFY_AND_NOT_RENEW': No renewal after expiration. 
     * @return RenewFlag Gateway renewal type: 'NOTIFY_AND_MANUAL_RENEW': Manual renewal. 'NOTIFY_AND_AUTO_RENEW': Automatic renewal. 'NOT_NOTIFY_AND_NOT_RENEW': No renewal after expiration.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Gateway renewal type: 'NOTIFY_AND_MANUAL_RENEW': Manual renewal. 'NOTIFY_AND_AUTO_RENEW': Automatic renewal. 'NOT_NOTIFY_AND_NOT_RENEW': No renewal after expiration.
     * @param RenewFlag Gateway renewal type: 'NOTIFY_AND_MANUAL_RENEW': Manual renewal. 'NOTIFY_AND_AUTO_RENEW': Automatic renewal. 'NOT_NOTIFY_AND_NOT_RENEW': No renewal after expiration.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Gateway billing type: POSTPAID_BY_HOUR: Postpaid by hour; PREPAID: Prepaid. 
     * @return InstanceChargeType Gateway billing type: POSTPAID_BY_HOUR: Postpaid by hour; PREPAID: Prepaid.
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Gateway billing type: POSTPAID_BY_HOUR: Postpaid by hour; PREPAID: Prepaid.
     * @param InstanceChargeType Gateway billing type: POSTPAID_BY_HOUR: Postpaid by hour; PREPAID: Prepaid.
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Outbound bandwidth of gateway. 
     * @return InternetMaxBandwidthOut Outbound bandwidth of gateway.
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Outbound bandwidth of gateway.
     * @param InternetMaxBandwidthOut Outbound bandwidth of gateway.
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Creation Time. 
     * @return CreatedTime Creation Time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation Time.
     * @param CreatedTime Creation Time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Expiration time of the prepaid gateway. 
     * @return ExpiredTime Expiration time of the prepaid gateway.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time of the prepaid gateway.
     * @param ExpiredTime Expiration time of the prepaid gateway.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Whether the public IP is blocked. 
     * @return IsAddressBlocked Whether the public IP is blocked.
     */
    public Boolean getIsAddressBlocked() {
        return this.IsAddressBlocked;
    }

    /**
     * Set Whether the public IP is blocked.
     * @param IsAddressBlocked Whether the public IP is blocked.
     */
    public void setIsAddressBlocked(Boolean IsAddressBlocked) {
        this.IsAddressBlocked = IsAddressBlocked;
    }

    /**
     * Get Change of billing method. PREPAID_TO_POSTPAID: Monthly subscription prepaid to postpaid by hour. 
     * @return NewPurchasePlan Change of billing method. PREPAID_TO_POSTPAID: Monthly subscription prepaid to postpaid by hour.
     */
    public String getNewPurchasePlan() {
        return this.NewPurchasePlan;
    }

    /**
     * Set Change of billing method. PREPAID_TO_POSTPAID: Monthly subscription prepaid to postpaid by hour.
     * @param NewPurchasePlan Change of billing method. PREPAID_TO_POSTPAID: Monthly subscription prepaid to postpaid by hour.
     */
    public void setNewPurchasePlan(String NewPurchasePlan) {
        this.NewPurchasePlan = NewPurchasePlan;
    }

    /**
     * Get Gateway billing status. PROTECTIVELY_ISOLATED: Instance is isolated; NORMAL: Normal. 
     * @return RestrictState Gateway billing status. PROTECTIVELY_ISOLATED: Instance is isolated; NORMAL: Normal.
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set Gateway billing status. PROTECTIVELY_ISOLATED: Instance is isolated; NORMAL: Normal.
     * @param RestrictState Gateway billing status. PROTECTIVELY_ISOLATED: Instance is isolated; NORMAL: Normal.
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * Get The availability zone, such as `ap-guangzhou-2` 
     * @return Zone The availability zone, such as `ap-guangzhou-2`
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set The availability zone, such as `ap-guangzhou-2`
     * @param Zone The availability zone, such as `ap-guangzhou-2`
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Gateway bandwidth quota information. 
     * @return VpnGatewayQuotaSet Gateway bandwidth quota information.
     */
    public VpnGatewayQuota [] getVpnGatewayQuotaSet() {
        return this.VpnGatewayQuotaSet;
    }

    /**
     * Set Gateway bandwidth quota information.
     * @param VpnGatewayQuotaSet Gateway bandwidth quota information.
     */
    public void setVpnGatewayQuotaSet(VpnGatewayQuota [] VpnGatewayQuotaSet) {
        this.VpnGatewayQuotaSet = VpnGatewayQuotaSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpnGatewayName", this.VpnGatewayName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "IsAddressBlocked", this.IsAddressBlocked);
        this.setParamSimple(map, prefix + "NewPurchasePlan", this.NewPurchasePlan);
        this.setParamSimple(map, prefix + "RestrictState", this.RestrictState);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "VpnGatewayQuotaSet.", this.VpnGatewayQuotaSet);

    }
}

