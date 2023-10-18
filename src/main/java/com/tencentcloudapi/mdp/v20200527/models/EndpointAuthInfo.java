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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndpointAuthInfo extends AbstractModel {

    /**
    * The security group allowlist in CIDR format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WhiteIpList")
    @Expose
    private String [] WhiteIpList;

    /**
    * The security group blocklist in CIDR format.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BlackIpList")
    @Expose
    private String [] BlackIpList;

    /**
    * The authentication key. Its value is same as `X-TENCENT-PACKAGE` set in the HTTP request header.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
     * Get The security group allowlist in CIDR format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return WhiteIpList The security group allowlist in CIDR format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getWhiteIpList() {
        return this.WhiteIpList;
    }

    /**
     * Set The security group allowlist in CIDR format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param WhiteIpList The security group allowlist in CIDR format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setWhiteIpList(String [] WhiteIpList) {
        this.WhiteIpList = WhiteIpList;
    }

    /**
     * Get The security group blocklist in CIDR format.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return BlackIpList The security group blocklist in CIDR format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getBlackIpList() {
        return this.BlackIpList;
    }

    /**
     * Set The security group blocklist in CIDR format.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param BlackIpList The security group blocklist in CIDR format.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setBlackIpList(String [] BlackIpList) {
        this.BlackIpList = BlackIpList;
    }

    /**
     * Get The authentication key. Its value is same as `X-TENCENT-PACKAGE` set in the HTTP request header.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AuthKey The authentication key. Its value is same as `X-TENCENT-PACKAGE` set in the HTTP request header.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set The authentication key. Its value is same as `X-TENCENT-PACKAGE` set in the HTTP request header.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AuthKey The authentication key. Its value is same as `X-TENCENT-PACKAGE` set in the HTTP request header.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    public EndpointAuthInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndpointAuthInfo(EndpointAuthInfo source) {
        if (source.WhiteIpList != null) {
            this.WhiteIpList = new String[source.WhiteIpList.length];
            for (int i = 0; i < source.WhiteIpList.length; i++) {
                this.WhiteIpList[i] = new String(source.WhiteIpList[i]);
            }
        }
        if (source.BlackIpList != null) {
            this.BlackIpList = new String[source.BlackIpList.length];
            for (int i = 0; i < source.BlackIpList.length; i++) {
                this.BlackIpList[i] = new String(source.BlackIpList[i]);
            }
        }
        if (source.AuthKey != null) {
            this.AuthKey = new String(source.AuthKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "WhiteIpList.", this.WhiteIpList);
        this.setParamArraySimple(map, prefix + "BlackIpList.", this.BlackIpList);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);

    }
}

