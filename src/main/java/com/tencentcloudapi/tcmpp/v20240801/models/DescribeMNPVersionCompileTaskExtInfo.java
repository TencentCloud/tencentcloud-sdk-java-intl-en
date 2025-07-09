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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPVersionCompileTaskExtInfo extends AbstractModel {

    /**
    * TCMPP error message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TCMPPErrMsg")
    @Expose
    private String TCMPPErrMsg;

    /**
    * WX Error Message
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WXErrMsg")
    @Expose
    private String WXErrMsg;

    /**
    * WeChat QR code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("WXQrCode")
    @Expose
    private String WXQrCode;

    /**
    * Compile size Information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SizeInfo")
    @Expose
    private String SizeInfo;

    /**
     * Get TCMPP error message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TCMPPErrMsg TCMPP error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTCMPPErrMsg() {
        return this.TCMPPErrMsg;
    }

    /**
     * Set TCMPP error message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TCMPPErrMsg TCMPP error message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTCMPPErrMsg(String TCMPPErrMsg) {
        this.TCMPPErrMsg = TCMPPErrMsg;
    }

    /**
     * Get WX Error Message
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WXErrMsg WX Error Message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWXErrMsg() {
        return this.WXErrMsg;
    }

    /**
     * Set WX Error Message
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WXErrMsg WX Error Message
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWXErrMsg(String WXErrMsg) {
        this.WXErrMsg = WXErrMsg;
    }

    /**
     * Get WeChat QR code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return WXQrCode WeChat QR code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWXQrCode() {
        return this.WXQrCode;
    }

    /**
     * Set WeChat QR code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param WXQrCode WeChat QR code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWXQrCode(String WXQrCode) {
        this.WXQrCode = WXQrCode;
    }

    /**
     * Get Compile size Information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SizeInfo Compile size Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSizeInfo() {
        return this.SizeInfo;
    }

    /**
     * Set Compile size Information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SizeInfo Compile size Information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSizeInfo(String SizeInfo) {
        this.SizeInfo = SizeInfo;
    }

    public DescribeMNPVersionCompileTaskExtInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPVersionCompileTaskExtInfo(DescribeMNPVersionCompileTaskExtInfo source) {
        if (source.TCMPPErrMsg != null) {
            this.TCMPPErrMsg = new String(source.TCMPPErrMsg);
        }
        if (source.WXErrMsg != null) {
            this.WXErrMsg = new String(source.WXErrMsg);
        }
        if (source.WXQrCode != null) {
            this.WXQrCode = new String(source.WXQrCode);
        }
        if (source.SizeInfo != null) {
            this.SizeInfo = new String(source.SizeInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TCMPPErrMsg", this.TCMPPErrMsg);
        this.setParamSimple(map, prefix + "WXErrMsg", this.WXErrMsg);
        this.setParamSimple(map, prefix + "WXQrCode", this.WXQrCode);
        this.setParamSimple(map, prefix + "SizeInfo", this.SizeInfo);

    }
}

