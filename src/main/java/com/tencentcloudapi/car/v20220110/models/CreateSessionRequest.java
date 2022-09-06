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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSessionRequest extends AbstractModel{

    /**
    * The user’s unique ID. Tencent Cloud does not parse the ID. You need to manage your own user IDs. Based on your needs, you can either define unique IDs for users or use timestamps to generate random IDs. Make sure the same ID is used when a user reconnects to your application.
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * The user’s IP address.
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * The client-side session data, which is obtained from the SDK.
    */
    @SerializedName("ClientSession")
    @Expose
    private String ClientSession;

    /**
    * The on-cloud running mode.
`RunWithoutClient`: Keep the application running on the cloud even when there are no client connections.
Empty string (default): Keep the application running on the cloud only when there are client connections.
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
     * Get The user’s unique ID. Tencent Cloud does not parse the ID. You need to manage your own user IDs. Based on your needs, you can either define unique IDs for users or use timestamps to generate random IDs. Make sure the same ID is used when a user reconnects to your application. 
     * @return UserId The user’s unique ID. Tencent Cloud does not parse the ID. You need to manage your own user IDs. Based on your needs, you can either define unique IDs for users or use timestamps to generate random IDs. Make sure the same ID is used when a user reconnects to your application.
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set The user’s unique ID. Tencent Cloud does not parse the ID. You need to manage your own user IDs. Based on your needs, you can either define unique IDs for users or use timestamps to generate random IDs. Make sure the same ID is used when a user reconnects to your application.
     * @param UserId The user’s unique ID. Tencent Cloud does not parse the ID. You need to manage your own user IDs. Based on your needs, you can either define unique IDs for users or use timestamps to generate random IDs. Make sure the same ID is used when a user reconnects to your application.
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get The user’s IP address. 
     * @return UserIp The user’s IP address.
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set The user’s IP address.
     * @param UserIp The user’s IP address.
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get The client-side session data, which is obtained from the SDK. 
     * @return ClientSession The client-side session data, which is obtained from the SDK.
     */
    public String getClientSession() {
        return this.ClientSession;
    }

    /**
     * Set The client-side session data, which is obtained from the SDK.
     * @param ClientSession The client-side session data, which is obtained from the SDK.
     */
    public void setClientSession(String ClientSession) {
        this.ClientSession = ClientSession;
    }

    /**
     * Get The on-cloud running mode.
`RunWithoutClient`: Keep the application running on the cloud even when there are no client connections.
Empty string (default): Keep the application running on the cloud only when there are client connections. 
     * @return RunMode The on-cloud running mode.
`RunWithoutClient`: Keep the application running on the cloud even when there are no client connections.
Empty string (default): Keep the application running on the cloud only when there are client connections.
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set The on-cloud running mode.
`RunWithoutClient`: Keep the application running on the cloud even when there are no client connections.
Empty string (default): Keep the application running on the cloud only when there are client connections.
     * @param RunMode The on-cloud running mode.
`RunWithoutClient`: Keep the application running on the cloud even when there are no client connections.
Empty string (default): Keep the application running on the cloud only when there are client connections.
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    public CreateSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSessionRequest(CreateSessionRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.ClientSession != null) {
            this.ClientSession = new String(source.ClientSession);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "ClientSession", this.ClientSession);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);

    }
}

