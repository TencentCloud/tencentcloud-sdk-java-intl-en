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

public class SaleInfo extends AbstractModel {

    /**
    * Manually set flag.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Flag")
    @Expose
    private Boolean Flag;

    /**
    * CKafka version (v1.1.1/2.4.2/0.10.2）
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Whether it is Pro Edition or Standard Edition.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Whether it has been sold out. `true`: sold out.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("SoldOut")
    @Expose
    private Boolean SoldOut;

    /**
     * Get Manually set flag.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Flag Manually set flag.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getFlag() {
        return this.Flag;
    }

    /**
     * Set Manually set flag.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Flag Manually set flag.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }

    /**
     * Get CKafka version (v1.1.1/2.4.2/0.10.2）
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Version CKafka version (v1.1.1/2.4.2/0.10.2）
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set CKafka version (v1.1.1/2.4.2/0.10.2）
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Version CKafka version (v1.1.1/2.4.2/0.10.2）
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Whether it is Pro Edition or Standard Edition.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Platform Whether it is Pro Edition or Standard Edition.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Whether it is Pro Edition or Standard Edition.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Platform Whether it is Pro Edition or Standard Edition.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Whether it has been sold out. `true`: sold out.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return SoldOut Whether it has been sold out. `true`: sold out.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Boolean getSoldOut() {
        return this.SoldOut;
    }

    /**
     * Set Whether it has been sold out. `true`: sold out.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param SoldOut Whether it has been sold out. `true`: sold out.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setSoldOut(Boolean SoldOut) {
        this.SoldOut = SoldOut;
    }

    public SaleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SaleInfo(SaleInfo source) {
        if (source.Flag != null) {
            this.Flag = new Boolean(source.Flag);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.SoldOut != null) {
            this.SoldOut = new Boolean(source.SoldOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "SoldOut", this.SoldOut);

    }
}

