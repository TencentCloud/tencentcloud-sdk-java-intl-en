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

public class InstanceVersion extends AbstractModel {

    /**
    * CKafka cluster instance version.
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * Broker version information.
    */
    @SerializedName("CurBrokerVersion")
    @Expose
    private String CurBrokerVersion;

    /**
    * Latest version information.
    */
    @SerializedName("LatestBrokerVersion")
    @Expose
    private LatestBrokerVersion [] LatestBrokerVersion;

    /**
    * Whether to allow kernel upgrades across major versions.
    */
    @SerializedName("AllowUpgradeHighVersion")
    @Expose
    private Boolean AllowUpgradeHighVersion;

    /**
    * Major version allowed for upgrades.
    */
    @SerializedName("HighVersionSet")
    @Expose
    private String [] HighVersionSet;

    /**
    * Whether to allow automatic deletion of consumer groups during minor version configuration.
    */
    @SerializedName("AllowAutoDeleteTimestamp")
    @Expose
    private Boolean AllowAutoDeleteTimestamp;

    /**
     * Get CKafka cluster instance version. 
     * @return KafkaVersion CKafka cluster instance version.
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set CKafka cluster instance version.
     * @param KafkaVersion CKafka cluster instance version.
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get Broker version information. 
     * @return CurBrokerVersion Broker version information.
     */
    public String getCurBrokerVersion() {
        return this.CurBrokerVersion;
    }

    /**
     * Set Broker version information.
     * @param CurBrokerVersion Broker version information.
     */
    public void setCurBrokerVersion(String CurBrokerVersion) {
        this.CurBrokerVersion = CurBrokerVersion;
    }

    /**
     * Get Latest version information. 
     * @return LatestBrokerVersion Latest version information.
     */
    public LatestBrokerVersion [] getLatestBrokerVersion() {
        return this.LatestBrokerVersion;
    }

    /**
     * Set Latest version information.
     * @param LatestBrokerVersion Latest version information.
     */
    public void setLatestBrokerVersion(LatestBrokerVersion [] LatestBrokerVersion) {
        this.LatestBrokerVersion = LatestBrokerVersion;
    }

    /**
     * Get Whether to allow kernel upgrades across major versions. 
     * @return AllowUpgradeHighVersion Whether to allow kernel upgrades across major versions.
     */
    public Boolean getAllowUpgradeHighVersion() {
        return this.AllowUpgradeHighVersion;
    }

    /**
     * Set Whether to allow kernel upgrades across major versions.
     * @param AllowUpgradeHighVersion Whether to allow kernel upgrades across major versions.
     */
    public void setAllowUpgradeHighVersion(Boolean AllowUpgradeHighVersion) {
        this.AllowUpgradeHighVersion = AllowUpgradeHighVersion;
    }

    /**
     * Get Major version allowed for upgrades. 
     * @return HighVersionSet Major version allowed for upgrades.
     */
    public String [] getHighVersionSet() {
        return this.HighVersionSet;
    }

    /**
     * Set Major version allowed for upgrades.
     * @param HighVersionSet Major version allowed for upgrades.
     */
    public void setHighVersionSet(String [] HighVersionSet) {
        this.HighVersionSet = HighVersionSet;
    }

    /**
     * Get Whether to allow automatic deletion of consumer groups during minor version configuration. 
     * @return AllowAutoDeleteTimestamp Whether to allow automatic deletion of consumer groups during minor version configuration.
     */
    public Boolean getAllowAutoDeleteTimestamp() {
        return this.AllowAutoDeleteTimestamp;
    }

    /**
     * Set Whether to allow automatic deletion of consumer groups during minor version configuration.
     * @param AllowAutoDeleteTimestamp Whether to allow automatic deletion of consumer groups during minor version configuration.
     */
    public void setAllowAutoDeleteTimestamp(Boolean AllowAutoDeleteTimestamp) {
        this.AllowAutoDeleteTimestamp = AllowAutoDeleteTimestamp;
    }

    public InstanceVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceVersion(InstanceVersion source) {
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.CurBrokerVersion != null) {
            this.CurBrokerVersion = new String(source.CurBrokerVersion);
        }
        if (source.LatestBrokerVersion != null) {
            this.LatestBrokerVersion = new LatestBrokerVersion[source.LatestBrokerVersion.length];
            for (int i = 0; i < source.LatestBrokerVersion.length; i++) {
                this.LatestBrokerVersion[i] = new LatestBrokerVersion(source.LatestBrokerVersion[i]);
            }
        }
        if (source.AllowUpgradeHighVersion != null) {
            this.AllowUpgradeHighVersion = new Boolean(source.AllowUpgradeHighVersion);
        }
        if (source.HighVersionSet != null) {
            this.HighVersionSet = new String[source.HighVersionSet.length];
            for (int i = 0; i < source.HighVersionSet.length; i++) {
                this.HighVersionSet[i] = new String(source.HighVersionSet[i]);
            }
        }
        if (source.AllowAutoDeleteTimestamp != null) {
            this.AllowAutoDeleteTimestamp = new Boolean(source.AllowAutoDeleteTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamSimple(map, prefix + "CurBrokerVersion", this.CurBrokerVersion);
        this.setParamArrayObj(map, prefix + "LatestBrokerVersion.", this.LatestBrokerVersion);
        this.setParamSimple(map, prefix + "AllowUpgradeHighVersion", this.AllowUpgradeHighVersion);
        this.setParamArraySimple(map, prefix + "HighVersionSet.", this.HighVersionSet);
        this.setParamSimple(map, prefix + "AllowAutoDeleteTimestamp", this.AllowAutoDeleteTimestamp);

    }
}

