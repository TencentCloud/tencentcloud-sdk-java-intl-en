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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCallerIdentityResponse extends AbstractModel {

    /**
    * ARN of the current caller.
    */
    @SerializedName("Arn")
    @Expose
    private String Arn;

    /**
    * Root account UIN of the current caller.
    */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
    * User ID.
1. If the caller is a Tencent Cloud account, the UIN of the current account is returned.
2. If the caller is a role, `roleId:roleSessionName` is returned.
3. If the caller is a federated user, `uin:federatedUserName` is returned.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * Account UIN.
1. If the caller is a Tencent Cloud account, the UIN of the current account is returned.
2. If the caller is a role, the UIN of the account that applies for the role is returned.
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * Identity type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get ARN of the current caller. 
     * @return Arn ARN of the current caller.
     */
    public String getArn() {
        return this.Arn;
    }

    /**
     * Set ARN of the current caller.
     * @param Arn ARN of the current caller.
     */
    public void setArn(String Arn) {
        this.Arn = Arn;
    }

    /**
     * Get Root account UIN of the current caller. 
     * @return AccountId Root account UIN of the current caller.
     */
    public String getAccountId() {
        return this.AccountId;
    }

    /**
     * Set Root account UIN of the current caller.
     * @param AccountId Root account UIN of the current caller.
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get User ID.
1. If the caller is a Tencent Cloud account, the UIN of the current account is returned.
2. If the caller is a role, `roleId:roleSessionName` is returned.
3. If the caller is a federated user, `uin:federatedUserName` is returned. 
     * @return UserId User ID.
1. If the caller is a Tencent Cloud account, the UIN of the current account is returned.
2. If the caller is a role, `roleId:roleSessionName` is returned.
3. If the caller is a federated user, `uin:federatedUserName` is returned.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set User ID.
1. If the caller is a Tencent Cloud account, the UIN of the current account is returned.
2. If the caller is a role, `roleId:roleSessionName` is returned.
3. If the caller is a federated user, `uin:federatedUserName` is returned.
     * @param UserId User ID.
1. If the caller is a Tencent Cloud account, the UIN of the current account is returned.
2. If the caller is a role, `roleId:roleSessionName` is returned.
3. If the caller is a federated user, `uin:federatedUserName` is returned.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get Account UIN.
1. If the caller is a Tencent Cloud account, the UIN of the current account is returned.
2. If the caller is a role, the UIN of the account that applies for the role is returned. 
     * @return PrincipalId Account UIN.
1. If the caller is a Tencent Cloud account, the UIN of the current account is returned.
2. If the caller is a role, the UIN of the account that applies for the role is returned.
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set Account UIN.
1. If the caller is a Tencent Cloud account, the UIN of the current account is returned.
2. If the caller is a role, the UIN of the account that applies for the role is returned.
     * @param PrincipalId Account UIN.
1. If the caller is a Tencent Cloud account, the UIN of the current account is returned.
2. If the caller is a role, the UIN of the account that applies for the role is returned.
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get Identity type. 
     * @return Type Identity type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Identity type.
     * @param Type Identity type.
     */
    public void setType(String Type) {
        this.Type = Type;
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

    public GetCallerIdentityResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCallerIdentityResponse(GetCallerIdentityResponse source) {
        if (source.Arn != null) {
            this.Arn = new String(source.Arn);
        }
        if (source.AccountId != null) {
            this.AccountId = new String(source.AccountId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Arn", this.Arn);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

