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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class XForwardedForConfig extends AbstractModel {

    /**
    * Whether to get the CLB instance ID through the ALB-ID header field.
- **true**: Yes.
- **false**: No.
    */
    @SerializedName("XForwardedForAlbIdEnabled")
    @Expose
    private Boolean XForwardedForAlbIdEnabled;

    /**
    * Whether to obtain the port of the client accessing the load balancing instance through the X-Forwarded-Client-srcport header field.
- **true**: Yes.
- **false**: No.
    */
    @SerializedName("XForwardedForClientSrcPortEnabled")
    @Expose
    private Boolean XForwardedForClientSrcPortEnabled;

    /**
    * Whether to enable obtaining the client domain name that accesses the load balancing instance through the X-Forwarded-Host header field.
- **true**: yes.
- **false**: No.
    */
    @SerializedName("XForwardedForHostEnabled")
    @Expose
    private Boolean XForwardedForHostEnabled;

    /**
    * Specify how to handle the X-Forwarded-For (XFF) HTTP header field.
- **append**: Append mode (default). Appends the real IP of the client to the end of the X-Forwarded-For header, retaining the original XFF link information.
-**remove**: Deletion mode. Remove the X-Forwarded-For header field and do not pass this header to the real server.
- **passthrough**: Passthrough mode. The X-Forwarded-For header remains unchanged and is directly passed through to the real server without any modification.

    */
    @SerializedName("XForwardedForMode")
    @Expose
    private String XForwardedForMode;

    /**
    * Whether to obtain the listening port of the load balancing instance through the X-Forwarded-Port header field.
- **true**: yes.
- **false**: No.
    */
    @SerializedName("XForwardedForPortEnabled")
    @Expose
    private Boolean XForwardedForPortEnabled;

    /**
    * Whether to obtain the listening protocol of the load balancing instance through the X-Forwarded-Proto header field.
- **true**: yes.
- **false**: No.

    */
    @SerializedName("XForwardedForProtoEnabled")
    @Expose
    private Boolean XForwardedForProtoEnabled;

    /**
    * Whether to access the issuer of the client certificate $ssl_client_i_dn through the X-Tencent-Client-IDN header.
- **true**: yes.
- **false**: No.

    */
    @SerializedName("XTencentClientIDNEnabled")
    @Expose
    private Boolean XTencentClientIDNEnabled;

    /**
    * Whether to access the subject of the client certificate $ssl_client_s_dn through the X-Tencent-Client-SDN header.
- **true**: yes.
- **false**: No.

    */
    @SerializedName("XTencentClientSDNEnabled")
    @Expose
    private Boolean XTencentClientSDNEnabled;

    /**
    * Whether to access the serial number $ssl_client_serial of the client certificate through the X-Tencent-Client-Serial header.
- **true**: yes.
- **false**: No.

    */
    @SerializedName("XTencentClientSerialEnabled")
    @Expose
    private Boolean XTencentClientSerialEnabled;

    /**
    * Access the verification result $ssl_client_verify of the client certificate through the X-Tencent-Client-Verify header.
- **true**: yes.
- **false**: No.

    */
    @SerializedName("XTencentClientVerifyEnabled")
    @Expose
    private Boolean XTencentClientVerifyEnabled;

    /**
     * Get Whether to get the CLB instance ID through the ALB-ID header field.
- **true**: Yes.
- **false**: No. 
     * @return XForwardedForAlbIdEnabled Whether to get the CLB instance ID through the ALB-ID header field.
- **true**: Yes.
- **false**: No.
     */
    public Boolean getXForwardedForAlbIdEnabled() {
        return this.XForwardedForAlbIdEnabled;
    }

    /**
     * Set Whether to get the CLB instance ID through the ALB-ID header field.
- **true**: Yes.
- **false**: No.
     * @param XForwardedForAlbIdEnabled Whether to get the CLB instance ID through the ALB-ID header field.
- **true**: Yes.
- **false**: No.
     */
    public void setXForwardedForAlbIdEnabled(Boolean XForwardedForAlbIdEnabled) {
        this.XForwardedForAlbIdEnabled = XForwardedForAlbIdEnabled;
    }

    /**
     * Get Whether to obtain the port of the client accessing the load balancing instance through the X-Forwarded-Client-srcport header field.
- **true**: Yes.
- **false**: No. 
     * @return XForwardedForClientSrcPortEnabled Whether to obtain the port of the client accessing the load balancing instance through the X-Forwarded-Client-srcport header field.
- **true**: Yes.
- **false**: No.
     */
    public Boolean getXForwardedForClientSrcPortEnabled() {
        return this.XForwardedForClientSrcPortEnabled;
    }

    /**
     * Set Whether to obtain the port of the client accessing the load balancing instance through the X-Forwarded-Client-srcport header field.
- **true**: Yes.
- **false**: No.
     * @param XForwardedForClientSrcPortEnabled Whether to obtain the port of the client accessing the load balancing instance through the X-Forwarded-Client-srcport header field.
- **true**: Yes.
- **false**: No.
     */
    public void setXForwardedForClientSrcPortEnabled(Boolean XForwardedForClientSrcPortEnabled) {
        this.XForwardedForClientSrcPortEnabled = XForwardedForClientSrcPortEnabled;
    }

    /**
     * Get Whether to enable obtaining the client domain name that accesses the load balancing instance through the X-Forwarded-Host header field.
- **true**: yes.
- **false**: No. 
     * @return XForwardedForHostEnabled Whether to enable obtaining the client domain name that accesses the load balancing instance through the X-Forwarded-Host header field.
- **true**: yes.
- **false**: No.
     */
    public Boolean getXForwardedForHostEnabled() {
        return this.XForwardedForHostEnabled;
    }

    /**
     * Set Whether to enable obtaining the client domain name that accesses the load balancing instance through the X-Forwarded-Host header field.
- **true**: yes.
- **false**: No.
     * @param XForwardedForHostEnabled Whether to enable obtaining the client domain name that accesses the load balancing instance through the X-Forwarded-Host header field.
- **true**: yes.
- **false**: No.
     */
    public void setXForwardedForHostEnabled(Boolean XForwardedForHostEnabled) {
        this.XForwardedForHostEnabled = XForwardedForHostEnabled;
    }

    /**
     * Get Specify how to handle the X-Forwarded-For (XFF) HTTP header field.
- **append**: Append mode (default). Appends the real IP of the client to the end of the X-Forwarded-For header, retaining the original XFF link information.
-**remove**: Deletion mode. Remove the X-Forwarded-For header field and do not pass this header to the real server.
- **passthrough**: Passthrough mode. The X-Forwarded-For header remains unchanged and is directly passed through to the real server without any modification.
 
     * @return XForwardedForMode Specify how to handle the X-Forwarded-For (XFF) HTTP header field.
- **append**: Append mode (default). Appends the real IP of the client to the end of the X-Forwarded-For header, retaining the original XFF link information.
-**remove**: Deletion mode. Remove the X-Forwarded-For header field and do not pass this header to the real server.
- **passthrough**: Passthrough mode. The X-Forwarded-For header remains unchanged and is directly passed through to the real server without any modification.

     */
    public String getXForwardedForMode() {
        return this.XForwardedForMode;
    }

    /**
     * Set Specify how to handle the X-Forwarded-For (XFF) HTTP header field.
- **append**: Append mode (default). Appends the real IP of the client to the end of the X-Forwarded-For header, retaining the original XFF link information.
-**remove**: Deletion mode. Remove the X-Forwarded-For header field and do not pass this header to the real server.
- **passthrough**: Passthrough mode. The X-Forwarded-For header remains unchanged and is directly passed through to the real server without any modification.

     * @param XForwardedForMode Specify how to handle the X-Forwarded-For (XFF) HTTP header field.
- **append**: Append mode (default). Appends the real IP of the client to the end of the X-Forwarded-For header, retaining the original XFF link information.
-**remove**: Deletion mode. Remove the X-Forwarded-For header field and do not pass this header to the real server.
- **passthrough**: Passthrough mode. The X-Forwarded-For header remains unchanged and is directly passed through to the real server without any modification.

     */
    public void setXForwardedForMode(String XForwardedForMode) {
        this.XForwardedForMode = XForwardedForMode;
    }

    /**
     * Get Whether to obtain the listening port of the load balancing instance through the X-Forwarded-Port header field.
- **true**: yes.
- **false**: No. 
     * @return XForwardedForPortEnabled Whether to obtain the listening port of the load balancing instance through the X-Forwarded-Port header field.
- **true**: yes.
- **false**: No.
     */
    public Boolean getXForwardedForPortEnabled() {
        return this.XForwardedForPortEnabled;
    }

    /**
     * Set Whether to obtain the listening port of the load balancing instance through the X-Forwarded-Port header field.
- **true**: yes.
- **false**: No.
     * @param XForwardedForPortEnabled Whether to obtain the listening port of the load balancing instance through the X-Forwarded-Port header field.
- **true**: yes.
- **false**: No.
     */
    public void setXForwardedForPortEnabled(Boolean XForwardedForPortEnabled) {
        this.XForwardedForPortEnabled = XForwardedForPortEnabled;
    }

    /**
     * Get Whether to obtain the listening protocol of the load balancing instance through the X-Forwarded-Proto header field.
- **true**: yes.
- **false**: No.
 
     * @return XForwardedForProtoEnabled Whether to obtain the listening protocol of the load balancing instance through the X-Forwarded-Proto header field.
- **true**: yes.
- **false**: No.

     */
    public Boolean getXForwardedForProtoEnabled() {
        return this.XForwardedForProtoEnabled;
    }

    /**
     * Set Whether to obtain the listening protocol of the load balancing instance through the X-Forwarded-Proto header field.
- **true**: yes.
- **false**: No.

     * @param XForwardedForProtoEnabled Whether to obtain the listening protocol of the load balancing instance through the X-Forwarded-Proto header field.
- **true**: yes.
- **false**: No.

     */
    public void setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
        this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
    }

    /**
     * Get Whether to access the issuer of the client certificate $ssl_client_i_dn through the X-Tencent-Client-IDN header.
- **true**: yes.
- **false**: No.
 
     * @return XTencentClientIDNEnabled Whether to access the issuer of the client certificate $ssl_client_i_dn through the X-Tencent-Client-IDN header.
- **true**: yes.
- **false**: No.

     */
    public Boolean getXTencentClientIDNEnabled() {
        return this.XTencentClientIDNEnabled;
    }

    /**
     * Set Whether to access the issuer of the client certificate $ssl_client_i_dn through the X-Tencent-Client-IDN header.
- **true**: yes.
- **false**: No.

     * @param XTencentClientIDNEnabled Whether to access the issuer of the client certificate $ssl_client_i_dn through the X-Tencent-Client-IDN header.
- **true**: yes.
- **false**: No.

     */
    public void setXTencentClientIDNEnabled(Boolean XTencentClientIDNEnabled) {
        this.XTencentClientIDNEnabled = XTencentClientIDNEnabled;
    }

    /**
     * Get Whether to access the subject of the client certificate $ssl_client_s_dn through the X-Tencent-Client-SDN header.
- **true**: yes.
- **false**: No.
 
     * @return XTencentClientSDNEnabled Whether to access the subject of the client certificate $ssl_client_s_dn through the X-Tencent-Client-SDN header.
- **true**: yes.
- **false**: No.

     */
    public Boolean getXTencentClientSDNEnabled() {
        return this.XTencentClientSDNEnabled;
    }

    /**
     * Set Whether to access the subject of the client certificate $ssl_client_s_dn through the X-Tencent-Client-SDN header.
- **true**: yes.
- **false**: No.

     * @param XTencentClientSDNEnabled Whether to access the subject of the client certificate $ssl_client_s_dn through the X-Tencent-Client-SDN header.
- **true**: yes.
- **false**: No.

     */
    public void setXTencentClientSDNEnabled(Boolean XTencentClientSDNEnabled) {
        this.XTencentClientSDNEnabled = XTencentClientSDNEnabled;
    }

    /**
     * Get Whether to access the serial number $ssl_client_serial of the client certificate through the X-Tencent-Client-Serial header.
- **true**: yes.
- **false**: No.
 
     * @return XTencentClientSerialEnabled Whether to access the serial number $ssl_client_serial of the client certificate through the X-Tencent-Client-Serial header.
- **true**: yes.
- **false**: No.

     */
    public Boolean getXTencentClientSerialEnabled() {
        return this.XTencentClientSerialEnabled;
    }

    /**
     * Set Whether to access the serial number $ssl_client_serial of the client certificate through the X-Tencent-Client-Serial header.
- **true**: yes.
- **false**: No.

     * @param XTencentClientSerialEnabled Whether to access the serial number $ssl_client_serial of the client certificate through the X-Tencent-Client-Serial header.
- **true**: yes.
- **false**: No.

     */
    public void setXTencentClientSerialEnabled(Boolean XTencentClientSerialEnabled) {
        this.XTencentClientSerialEnabled = XTencentClientSerialEnabled;
    }

    /**
     * Get Access the verification result $ssl_client_verify of the client certificate through the X-Tencent-Client-Verify header.
- **true**: yes.
- **false**: No.
 
     * @return XTencentClientVerifyEnabled Access the verification result $ssl_client_verify of the client certificate through the X-Tencent-Client-Verify header.
- **true**: yes.
- **false**: No.

     */
    public Boolean getXTencentClientVerifyEnabled() {
        return this.XTencentClientVerifyEnabled;
    }

    /**
     * Set Access the verification result $ssl_client_verify of the client certificate through the X-Tencent-Client-Verify header.
- **true**: yes.
- **false**: No.

     * @param XTencentClientVerifyEnabled Access the verification result $ssl_client_verify of the client certificate through the X-Tencent-Client-Verify header.
- **true**: yes.
- **false**: No.

     */
    public void setXTencentClientVerifyEnabled(Boolean XTencentClientVerifyEnabled) {
        this.XTencentClientVerifyEnabled = XTencentClientVerifyEnabled;
    }

    public XForwardedForConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public XForwardedForConfig(XForwardedForConfig source) {
        if (source.XForwardedForAlbIdEnabled != null) {
            this.XForwardedForAlbIdEnabled = new Boolean(source.XForwardedForAlbIdEnabled);
        }
        if (source.XForwardedForClientSrcPortEnabled != null) {
            this.XForwardedForClientSrcPortEnabled = new Boolean(source.XForwardedForClientSrcPortEnabled);
        }
        if (source.XForwardedForHostEnabled != null) {
            this.XForwardedForHostEnabled = new Boolean(source.XForwardedForHostEnabled);
        }
        if (source.XForwardedForMode != null) {
            this.XForwardedForMode = new String(source.XForwardedForMode);
        }
        if (source.XForwardedForPortEnabled != null) {
            this.XForwardedForPortEnabled = new Boolean(source.XForwardedForPortEnabled);
        }
        if (source.XForwardedForProtoEnabled != null) {
            this.XForwardedForProtoEnabled = new Boolean(source.XForwardedForProtoEnabled);
        }
        if (source.XTencentClientIDNEnabled != null) {
            this.XTencentClientIDNEnabled = new Boolean(source.XTencentClientIDNEnabled);
        }
        if (source.XTencentClientSDNEnabled != null) {
            this.XTencentClientSDNEnabled = new Boolean(source.XTencentClientSDNEnabled);
        }
        if (source.XTencentClientSerialEnabled != null) {
            this.XTencentClientSerialEnabled = new Boolean(source.XTencentClientSerialEnabled);
        }
        if (source.XTencentClientVerifyEnabled != null) {
            this.XTencentClientVerifyEnabled = new Boolean(source.XTencentClientVerifyEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "XForwardedForAlbIdEnabled", this.XForwardedForAlbIdEnabled);
        this.setParamSimple(map, prefix + "XForwardedForClientSrcPortEnabled", this.XForwardedForClientSrcPortEnabled);
        this.setParamSimple(map, prefix + "XForwardedForHostEnabled", this.XForwardedForHostEnabled);
        this.setParamSimple(map, prefix + "XForwardedForMode", this.XForwardedForMode);
        this.setParamSimple(map, prefix + "XForwardedForPortEnabled", this.XForwardedForPortEnabled);
        this.setParamSimple(map, prefix + "XForwardedForProtoEnabled", this.XForwardedForProtoEnabled);
        this.setParamSimple(map, prefix + "XTencentClientIDNEnabled", this.XTencentClientIDNEnabled);
        this.setParamSimple(map, prefix + "XTencentClientSDNEnabled", this.XTencentClientSDNEnabled);
        this.setParamSimple(map, prefix + "XTencentClientSerialEnabled", this.XTencentClientSerialEnabled);
        this.setParamSimple(map, prefix + "XTencentClientVerifyEnabled", this.XTencentClientVerifyEnabled);

    }
}

