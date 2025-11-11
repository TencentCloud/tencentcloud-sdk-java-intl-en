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
    * The manually configured flag. valid values: true (sold-out), false (available).
    */
    @SerializedName("Flag")
    @Expose
    private Boolean Flag;

    /**
    * Specifies the ckafka version number (1.1.1/2.4.2/0.10.2).
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Pro edition, standard version flag.
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Specifies whether the item is sold-out. valid values: true (sold-out).
    */
    @SerializedName("SoldOut")
    @Expose
    private Boolean SoldOut;

    /**
     * Get The manually configured flag. valid values: true (sold-out), false (available). 
     * @return Flag The manually configured flag. valid values: true (sold-out), false (available).
     */
    public Boolean getFlag() {
        return this.Flag;
    }

    /**
     * Set The manually configured flag. valid values: true (sold-out), false (available).
     * @param Flag The manually configured flag. valid values: true (sold-out), false (available).
     */
    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }

    /**
     * Get Specifies the ckafka version number (1.1.1/2.4.2/0.10.2). 
     * @return Version Specifies the ckafka version number (1.1.1/2.4.2/0.10.2).
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Specifies the ckafka version number (1.1.1/2.4.2/0.10.2).
     * @param Version Specifies the ckafka version number (1.1.1/2.4.2/0.10.2).
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Pro edition, standard version flag. 
     * @return Platform Pro edition, standard version flag.
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set Pro edition, standard version flag.
     * @param Platform Pro edition, standard version flag.
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get Specifies whether the item is sold-out. valid values: true (sold-out). 
     * @return SoldOut Specifies whether the item is sold-out. valid values: true (sold-out).
     */
    public Boolean getSoldOut() {
        return this.SoldOut;
    }

    /**
     * Set Specifies whether the item is sold-out. valid values: true (sold-out).
     * @param SoldOut Specifies whether the item is sold-out. valid values: true (sold-out).
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

