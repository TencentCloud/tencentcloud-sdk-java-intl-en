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

public class CallRecord extends AbstractModel {

    /**
    * Invocation record ID.
    */
    @SerializedName("CallID")
    @Expose
    private String CallID;

    /**
    * Access key.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Access key remark.
    */
    @SerializedName("AccessKeyRemark")
    @Expose
    private String AccessKeyRemark;

    /**
    * Access key ID.
    */
    @SerializedName("AccessKeyID")
    @Expose
    private Long AccessKeyID;

    /**
    * Source IP of the call.
    */
    @SerializedName("SourceIP")
    @Expose
    private String SourceIP;

    /**
    * Source IP of the call remark.
    */
    @SerializedName("SourceIPRemark")
    @Expose
    private String SourceIPRemark;

    /**
    * Source IP region of the call.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * IP type 0: within the account (unremarked) 1: outside the account (unremarked) 2: within the account (remarked) 3: outside the account (remarked).
    */
    @SerializedName("IPType")
    @Expose
    private Long IPType;

    /**
    * Call interface name.
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * Call the product name.
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * Invocation type.
0: console invocation.
1:API
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * Type of user: CAMUser/root/AssumedRole.

    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * User/Role name.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Policy List
    */
    @SerializedName("PolicySet")
    @Expose
    private String [] PolicySet;

    /**
    * Number of calls.
    */
    @SerializedName("CallCount")
    @Expose
    private Long CallCount;

    /**
    * Error code.
0: Successful
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * First time call time.
    */
    @SerializedName("FirstCallTime")
    @Expose
    private String FirstCallTime;

    /**
    * Call time.
    */
    @SerializedName("LastCallTime")
    @Expose
    private String LastCallTime;

    /**
    * IP associated asset ID. if an empty string, means not associated with.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * Associated asset name of the IP.
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Aggregate date.
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * appid
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * Display status.
    */
    @SerializedName("ShowStatus")
    @Expose
    private Boolean ShowStatus;

    /**
    * Carrier.
    */
    @SerializedName("ISP")
    @Expose
    private String ISP;

    /**
    * vpc information list outside the account.
    */
    @SerializedName("VpcInfo")
    @Expose
    private SourceIPVpcInfo [] VpcInfo;

    /**
    * Request client list.
    */
    @SerializedName("ReqClient")
    @Expose
    private String [] ReqClient;

    /**
     * Get Invocation record ID. 
     * @return CallID Invocation record ID.
     */
    public String getCallID() {
        return this.CallID;
    }

    /**
     * Set Invocation record ID.
     * @param CallID Invocation record ID.
     */
    public void setCallID(String CallID) {
        this.CallID = CallID;
    }

    /**
     * Get Access key. 
     * @return AccessKey Access key.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Access key.
     * @param AccessKey Access key.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Access key remark. 
     * @return AccessKeyRemark Access key remark.
     */
    public String getAccessKeyRemark() {
        return this.AccessKeyRemark;
    }

    /**
     * Set Access key remark.
     * @param AccessKeyRemark Access key remark.
     */
    public void setAccessKeyRemark(String AccessKeyRemark) {
        this.AccessKeyRemark = AccessKeyRemark;
    }

    /**
     * Get Access key ID. 
     * @return AccessKeyID Access key ID.
     */
    public Long getAccessKeyID() {
        return this.AccessKeyID;
    }

    /**
     * Set Access key ID.
     * @param AccessKeyID Access key ID.
     */
    public void setAccessKeyID(Long AccessKeyID) {
        this.AccessKeyID = AccessKeyID;
    }

    /**
     * Get Source IP of the call. 
     * @return SourceIP Source IP of the call.
     */
    public String getSourceIP() {
        return this.SourceIP;
    }

    /**
     * Set Source IP of the call.
     * @param SourceIP Source IP of the call.
     */
    public void setSourceIP(String SourceIP) {
        this.SourceIP = SourceIP;
    }

    /**
     * Get Source IP of the call remark. 
     * @return SourceIPRemark Source IP of the call remark.
     */
    public String getSourceIPRemark() {
        return this.SourceIPRemark;
    }

    /**
     * Set Source IP of the call remark.
     * @param SourceIPRemark Source IP of the call remark.
     */
    public void setSourceIPRemark(String SourceIPRemark) {
        this.SourceIPRemark = SourceIPRemark;
    }

    /**
     * Get Source IP region of the call. 
     * @return Region Source IP region of the call.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Source IP region of the call.
     * @param Region Source IP region of the call.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get IP type 0: within the account (unremarked) 1: outside the account (unremarked) 2: within the account (remarked) 3: outside the account (remarked). 
     * @return IPType IP type 0: within the account (unremarked) 1: outside the account (unremarked) 2: within the account (remarked) 3: outside the account (remarked).
     */
    public Long getIPType() {
        return this.IPType;
    }

    /**
     * Set IP type 0: within the account (unremarked) 1: outside the account (unremarked) 2: within the account (remarked) 3: outside the account (remarked).
     * @param IPType IP type 0: within the account (unremarked) 1: outside the account (unremarked) 2: within the account (remarked) 3: outside the account (remarked).
     */
    public void setIPType(Long IPType) {
        this.IPType = IPType;
    }

    /**
     * Get Call interface name. 
     * @return EventName Call interface name.
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set Call interface name.
     * @param EventName Call interface name.
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get Call the product name. 
     * @return ProductName Call the product name.
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set Call the product name.
     * @param ProductName Call the product name.
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get Invocation type.
0: console invocation.
1:API 
     * @return EventType Invocation type.
0: console invocation.
1:API
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set Invocation type.
0: console invocation.
1:API
     * @param EventType Invocation type.
0: console invocation.
1:API
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get Type of user: CAMUser/root/AssumedRole.
 
     * @return UserType Type of user: CAMUser/root/AssumedRole.

     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set Type of user: CAMUser/root/AssumedRole.

     * @param UserType Type of user: CAMUser/root/AssumedRole.

     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get User/Role name. 
     * @return UserName User/Role name.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set User/Role name.
     * @param UserName User/Role name.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Policy List 
     * @return PolicySet Policy List
     */
    public String [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set Policy List
     * @param PolicySet Policy List
     */
    public void setPolicySet(String [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    /**
     * Get Number of calls. 
     * @return CallCount Number of calls.
     */
    public Long getCallCount() {
        return this.CallCount;
    }

    /**
     * Set Number of calls.
     * @param CallCount Number of calls.
     */
    public void setCallCount(Long CallCount) {
        this.CallCount = CallCount;
    }

    /**
     * Get Error code.
0: Successful 
     * @return Code Error code.
0: Successful
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set Error code.
0: Successful
     * @param Code Error code.
0: Successful
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get First time call time. 
     * @return FirstCallTime First time call time.
     */
    public String getFirstCallTime() {
        return this.FirstCallTime;
    }

    /**
     * Set First time call time.
     * @param FirstCallTime First time call time.
     */
    public void setFirstCallTime(String FirstCallTime) {
        this.FirstCallTime = FirstCallTime;
    }

    /**
     * Get Call time. 
     * @return LastCallTime Call time.
     */
    public String getLastCallTime() {
        return this.LastCallTime;
    }

    /**
     * Set Call time.
     * @param LastCallTime Call time.
     */
    public void setLastCallTime(String LastCallTime) {
        this.LastCallTime = LastCallTime;
    }

    /**
     * Get IP associated asset ID. if an empty string, means not associated with. 
     * @return InstanceID IP associated asset ID. if an empty string, means not associated with.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set IP associated asset ID. if an empty string, means not associated with.
     * @param InstanceID IP associated asset ID. if an empty string, means not associated with.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get Associated asset name of the IP. 
     * @return InstanceName Associated asset name of the IP.
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Associated asset name of the IP.
     * @param InstanceName Associated asset name of the IP.
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Aggregate date. 
     * @return Date Aggregate date.
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Aggregate date.
     * @param Date Aggregate date.
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get appid 
     * @return AppID appid
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set appid
     * @param AppID appid
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get Display status. 
     * @return ShowStatus Display status.
     */
    public Boolean getShowStatus() {
        return this.ShowStatus;
    }

    /**
     * Set Display status.
     * @param ShowStatus Display status.
     */
    public void setShowStatus(Boolean ShowStatus) {
        this.ShowStatus = ShowStatus;
    }

    /**
     * Get Carrier. 
     * @return ISP Carrier.
     */
    public String getISP() {
        return this.ISP;
    }

    /**
     * Set Carrier.
     * @param ISP Carrier.
     */
    public void setISP(String ISP) {
        this.ISP = ISP;
    }

    /**
     * Get vpc information list outside the account. 
     * @return VpcInfo vpc information list outside the account.
     */
    public SourceIPVpcInfo [] getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set vpc information list outside the account.
     * @param VpcInfo vpc information list outside the account.
     */
    public void setVpcInfo(SourceIPVpcInfo [] VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get Request client list. 
     * @return ReqClient Request client list.
     */
    public String [] getReqClient() {
        return this.ReqClient;
    }

    /**
     * Set Request client list.
     * @param ReqClient Request client list.
     */
    public void setReqClient(String [] ReqClient) {
        this.ReqClient = ReqClient;
    }

    public CallRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallRecord(CallRecord source) {
        if (source.CallID != null) {
            this.CallID = new String(source.CallID);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.AccessKeyRemark != null) {
            this.AccessKeyRemark = new String(source.AccessKeyRemark);
        }
        if (source.AccessKeyID != null) {
            this.AccessKeyID = new Long(source.AccessKeyID);
        }
        if (source.SourceIP != null) {
            this.SourceIP = new String(source.SourceIP);
        }
        if (source.SourceIPRemark != null) {
            this.SourceIPRemark = new String(source.SourceIPRemark);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.IPType != null) {
            this.IPType = new Long(source.IPType);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.PolicySet != null) {
            this.PolicySet = new String[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new String(source.PolicySet[i]);
            }
        }
        if (source.CallCount != null) {
            this.CallCount = new Long(source.CallCount);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.FirstCallTime != null) {
            this.FirstCallTime = new String(source.FirstCallTime);
        }
        if (source.LastCallTime != null) {
            this.LastCallTime = new String(source.LastCallTime);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ShowStatus != null) {
            this.ShowStatus = new Boolean(source.ShowStatus);
        }
        if (source.ISP != null) {
            this.ISP = new String(source.ISP);
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new SourceIPVpcInfo[source.VpcInfo.length];
            for (int i = 0; i < source.VpcInfo.length; i++) {
                this.VpcInfo[i] = new SourceIPVpcInfo(source.VpcInfo[i]);
            }
        }
        if (source.ReqClient != null) {
            this.ReqClient = new String[source.ReqClient.length];
            for (int i = 0; i < source.ReqClient.length; i++) {
                this.ReqClient[i] = new String(source.ReqClient[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallID", this.CallID);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "AccessKeyRemark", this.AccessKeyRemark);
        this.setParamSimple(map, prefix + "AccessKeyID", this.AccessKeyID);
        this.setParamSimple(map, prefix + "SourceIP", this.SourceIP);
        this.setParamSimple(map, prefix + "SourceIPRemark", this.SourceIPRemark);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "IPType", this.IPType);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArraySimple(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamSimple(map, prefix + "CallCount", this.CallCount);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "FirstCallTime", this.FirstCallTime);
        this.setParamSimple(map, prefix + "LastCallTime", this.LastCallTime);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ShowStatus", this.ShowStatus);
        this.setParamSimple(map, prefix + "ISP", this.ISP);
        this.setParamArrayObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamArraySimple(map, prefix + "ReqClient.", this.ReqClient);

    }
}

