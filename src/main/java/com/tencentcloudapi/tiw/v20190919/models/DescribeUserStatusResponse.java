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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserStatusResponse extends AbstractModel{

    /**
    * AppId of the customer.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Specifies whether the whiteboard service of the trial or official edition is activated before.

0: The whiteboard service is not activated.
1: The whiteboard service is activated.
    */
    @SerializedName("IsTiwUser")
    @Expose
    private Long IsTiwUser;

    /**
    * Specifies whether the interactive class feature of the trial or official edition is activated before.
    */
    @SerializedName("IsSaaSUser")
    @Expose
    private Long IsSaaSUser;

    /**
    * Specifies whether the user uses the offline recording feature of the whiteboard service.
    */
    @SerializedName("IsTiwOfflineRecordUser")
    @Expose
    private Long IsTiwOfflineRecordUser;

    /**
    * Specifies whether the user is authenticated.
    */
    @SerializedName("IsAuthenticated")
    @Expose
    private Long IsAuthenticated;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get AppId of the customer. 
     * @return AppId AppId of the customer.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set AppId of the customer.
     * @param AppId AppId of the customer.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Specifies whether the whiteboard service of the trial or official edition is activated before.

0: The whiteboard service is not activated.
1: The whiteboard service is activated. 
     * @return IsTiwUser Specifies whether the whiteboard service of the trial or official edition is activated before.

0: The whiteboard service is not activated.
1: The whiteboard service is activated.
     */
    public Long getIsTiwUser() {
        return this.IsTiwUser;
    }

    /**
     * Set Specifies whether the whiteboard service of the trial or official edition is activated before.

0: The whiteboard service is not activated.
1: The whiteboard service is activated.
     * @param IsTiwUser Specifies whether the whiteboard service of the trial or official edition is activated before.

0: The whiteboard service is not activated.
1: The whiteboard service is activated.
     */
    public void setIsTiwUser(Long IsTiwUser) {
        this.IsTiwUser = IsTiwUser;
    }

    /**
     * Get Specifies whether the interactive class feature of the trial or official edition is activated before. 
     * @return IsSaaSUser Specifies whether the interactive class feature of the trial or official edition is activated before.
     */
    public Long getIsSaaSUser() {
        return this.IsSaaSUser;
    }

    /**
     * Set Specifies whether the interactive class feature of the trial or official edition is activated before.
     * @param IsSaaSUser Specifies whether the interactive class feature of the trial or official edition is activated before.
     */
    public void setIsSaaSUser(Long IsSaaSUser) {
        this.IsSaaSUser = IsSaaSUser;
    }

    /**
     * Get Specifies whether the user uses the offline recording feature of the whiteboard service. 
     * @return IsTiwOfflineRecordUser Specifies whether the user uses the offline recording feature of the whiteboard service.
     */
    public Long getIsTiwOfflineRecordUser() {
        return this.IsTiwOfflineRecordUser;
    }

    /**
     * Set Specifies whether the user uses the offline recording feature of the whiteboard service.
     * @param IsTiwOfflineRecordUser Specifies whether the user uses the offline recording feature of the whiteboard service.
     */
    public void setIsTiwOfflineRecordUser(Long IsTiwOfflineRecordUser) {
        this.IsTiwOfflineRecordUser = IsTiwOfflineRecordUser;
    }

    /**
     * Get Specifies whether the user is authenticated. 
     * @return IsAuthenticated Specifies whether the user is authenticated.
     */
    public Long getIsAuthenticated() {
        return this.IsAuthenticated;
    }

    /**
     * Set Specifies whether the user is authenticated.
     * @param IsAuthenticated Specifies whether the user is authenticated.
     */
    public void setIsAuthenticated(Long IsAuthenticated) {
        this.IsAuthenticated = IsAuthenticated;
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

    public DescribeUserStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserStatusResponse(DescribeUserStatusResponse source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.IsTiwUser != null) {
            this.IsTiwUser = new Long(source.IsTiwUser);
        }
        if (source.IsSaaSUser != null) {
            this.IsSaaSUser = new Long(source.IsSaaSUser);
        }
        if (source.IsTiwOfflineRecordUser != null) {
            this.IsTiwOfflineRecordUser = new Long(source.IsTiwOfflineRecordUser);
        }
        if (source.IsAuthenticated != null) {
            this.IsAuthenticated = new Long(source.IsAuthenticated);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IsTiwUser", this.IsTiwUser);
        this.setParamSimple(map, prefix + "IsSaaSUser", this.IsSaaSUser);
        this.setParamSimple(map, prefix + "IsTiwOfflineRecordUser", this.IsTiwOfflineRecordUser);
        this.setParamSimple(map, prefix + "IsAuthenticated", this.IsAuthenticated);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

