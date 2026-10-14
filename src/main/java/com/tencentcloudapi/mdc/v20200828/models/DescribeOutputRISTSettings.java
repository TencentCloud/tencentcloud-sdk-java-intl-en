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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOutputRISTSettings extends AbstractModel {

    /**
    * RIST mode. Valid values: `LISTENER`, `CALLER`. Default value: `LISTENER`.
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * RIST configuration solution. Options: [MAIN|SIMPLE]. Default: MAIN.
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * RIST buffer size in milliseconds. Minimum value: 50 ms. Maximum value: 5000 ms. Default value: 120.
    */
    @SerializedName("Buffer")
    @Expose
    private Long Buffer;

    /**
    * Server listening address, used when the RIST mode is LISTENER.
    */
    @SerializedName("SourceAddresses")
    @Expose
    private OutputRISTSourceAddressResp [] SourceAddresses;

    /**
     * Get RIST mode. Valid values: `LISTENER`, `CALLER`. Default value: `LISTENER`. 
     * @return Mode RIST mode. Valid values: `LISTENER`, `CALLER`. Default value: `LISTENER`.
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set RIST mode. Valid values: `LISTENER`, `CALLER`. Default value: `LISTENER`.
     * @param Mode RIST mode. Valid values: `LISTENER`, `CALLER`. Default value: `LISTENER`.
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get RIST configuration solution. Options: [MAIN|SIMPLE]. Default: MAIN. 
     * @return Profile RIST configuration solution. Options: [MAIN|SIMPLE]. Default: MAIN.
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set RIST configuration solution. Options: [MAIN|SIMPLE]. Default: MAIN.
     * @param Profile RIST configuration solution. Options: [MAIN|SIMPLE]. Default: MAIN.
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get RIST buffer size in milliseconds. Minimum value: 50 ms. Maximum value: 5000 ms. Default value: 120. 
     * @return Buffer RIST buffer size in milliseconds. Minimum value: 50 ms. Maximum value: 5000 ms. Default value: 120.
     */
    public Long getBuffer() {
        return this.Buffer;
    }

    /**
     * Set RIST buffer size in milliseconds. Minimum value: 50 ms. Maximum value: 5000 ms. Default value: 120.
     * @param Buffer RIST buffer size in milliseconds. Minimum value: 50 ms. Maximum value: 5000 ms. Default value: 120.
     */
    public void setBuffer(Long Buffer) {
        this.Buffer = Buffer;
    }

    /**
     * Get Server listening address, used when the RIST mode is LISTENER. 
     * @return SourceAddresses Server listening address, used when the RIST mode is LISTENER.
     */
    public OutputRISTSourceAddressResp [] getSourceAddresses() {
        return this.SourceAddresses;
    }

    /**
     * Set Server listening address, used when the RIST mode is LISTENER.
     * @param SourceAddresses Server listening address, used when the RIST mode is LISTENER.
     */
    public void setSourceAddresses(OutputRISTSourceAddressResp [] SourceAddresses) {
        this.SourceAddresses = SourceAddresses;
    }

    public DescribeOutputRISTSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutputRISTSettings(DescribeOutputRISTSettings source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.Buffer != null) {
            this.Buffer = new Long(source.Buffer);
        }
        if (source.SourceAddresses != null) {
            this.SourceAddresses = new OutputRISTSourceAddressResp[source.SourceAddresses.length];
            for (int i = 0; i < source.SourceAddresses.length; i++) {
                this.SourceAddresses[i] = new OutputRISTSourceAddressResp(source.SourceAddresses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "Buffer", this.Buffer);
        this.setParamArrayObj(map, prefix + "SourceAddresses.", this.SourceAddresses);

    }
}

