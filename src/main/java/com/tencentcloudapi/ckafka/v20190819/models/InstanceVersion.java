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
    * <p>ckafka cluster instance version</p>
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * <p>broker version info</p>
    */
    @SerializedName("CurBrokerVersion")
    @Expose
    private String CurBrokerVersion;

    /**
    * <p>latest version info</p>
    */
    @SerializedName("LatestBrokerVersion")
    @Expose
    private LatestBrokerVersion [] LatestBrokerVersion;

    /**
    * <p>Permission for cross-major version kernel upgrade</p>
    */
    @SerializedName("AllowUpgradeHighVersion")
    @Expose
    private Boolean AllowUpgradeHighVersion;

    /**
    * <p>Permission for major version upgrade</p>
    */
    @SerializedName("HighVersionSet")
    @Expose
    private String [] HighVersionSet;

    /**
    * <p>Permission to configure auto deletion of consumer group for minor version number</p>
    */
    @SerializedName("AllowAutoDeleteTimestamp")
    @Expose
    private Boolean AllowAutoDeleteTimestamp;

    /**
    * <p>Allow the modification of transaction ID expiration time configuration</p>
    */
    @SerializedName("AllowModifyTxnIdExpiration")
    @Expose
    private Boolean AllowModifyTxnIdExpiration;

    /**
     * Get <p>ckafka cluster instance version</p> 
     * @return KafkaVersion <p>ckafka cluster instance version</p>
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set <p>ckafka cluster instance version</p>
     * @param KafkaVersion <p>ckafka cluster instance version</p>
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get <p>broker version info</p> 
     * @return CurBrokerVersion <p>broker version info</p>
     */
    public String getCurBrokerVersion() {
        return this.CurBrokerVersion;
    }

    /**
     * Set <p>broker version info</p>
     * @param CurBrokerVersion <p>broker version info</p>
     */
    public void setCurBrokerVersion(String CurBrokerVersion) {
        this.CurBrokerVersion = CurBrokerVersion;
    }

    /**
     * Get <p>latest version info</p> 
     * @return LatestBrokerVersion <p>latest version info</p>
     */
    public LatestBrokerVersion [] getLatestBrokerVersion() {
        return this.LatestBrokerVersion;
    }

    /**
     * Set <p>latest version info</p>
     * @param LatestBrokerVersion <p>latest version info</p>
     */
    public void setLatestBrokerVersion(LatestBrokerVersion [] LatestBrokerVersion) {
        this.LatestBrokerVersion = LatestBrokerVersion;
    }

    /**
     * Get <p>Permission for cross-major version kernel upgrade</p> 
     * @return AllowUpgradeHighVersion <p>Permission for cross-major version kernel upgrade</p>
     */
    public Boolean getAllowUpgradeHighVersion() {
        return this.AllowUpgradeHighVersion;
    }

    /**
     * Set <p>Permission for cross-major version kernel upgrade</p>
     * @param AllowUpgradeHighVersion <p>Permission for cross-major version kernel upgrade</p>
     */
    public void setAllowUpgradeHighVersion(Boolean AllowUpgradeHighVersion) {
        this.AllowUpgradeHighVersion = AllowUpgradeHighVersion;
    }

    /**
     * Get <p>Permission for major version upgrade</p> 
     * @return HighVersionSet <p>Permission for major version upgrade</p>
     */
    public String [] getHighVersionSet() {
        return this.HighVersionSet;
    }

    /**
     * Set <p>Permission for major version upgrade</p>
     * @param HighVersionSet <p>Permission for major version upgrade</p>
     */
    public void setHighVersionSet(String [] HighVersionSet) {
        this.HighVersionSet = HighVersionSet;
    }

    /**
     * Get <p>Permission to configure auto deletion of consumer group for minor version number</p> 
     * @return AllowAutoDeleteTimestamp <p>Permission to configure auto deletion of consumer group for minor version number</p>
     */
    public Boolean getAllowAutoDeleteTimestamp() {
        return this.AllowAutoDeleteTimestamp;
    }

    /**
     * Set <p>Permission to configure auto deletion of consumer group for minor version number</p>
     * @param AllowAutoDeleteTimestamp <p>Permission to configure auto deletion of consumer group for minor version number</p>
     */
    public void setAllowAutoDeleteTimestamp(Boolean AllowAutoDeleteTimestamp) {
        this.AllowAutoDeleteTimestamp = AllowAutoDeleteTimestamp;
    }

    /**
     * Get <p>Allow the modification of transaction ID expiration time configuration</p> 
     * @return AllowModifyTxnIdExpiration <p>Allow the modification of transaction ID expiration time configuration</p>
     */
    public Boolean getAllowModifyTxnIdExpiration() {
        return this.AllowModifyTxnIdExpiration;
    }

    /**
     * Set <p>Allow the modification of transaction ID expiration time configuration</p>
     * @param AllowModifyTxnIdExpiration <p>Allow the modification of transaction ID expiration time configuration</p>
     */
    public void setAllowModifyTxnIdExpiration(Boolean AllowModifyTxnIdExpiration) {
        this.AllowModifyTxnIdExpiration = AllowModifyTxnIdExpiration;
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
        if (source.AllowModifyTxnIdExpiration != null) {
            this.AllowModifyTxnIdExpiration = new Boolean(source.AllowModifyTxnIdExpiration);
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
        this.setParamSimple(map, prefix + "AllowModifyTxnIdExpiration", this.AllowModifyTxnIdExpiration);

    }
}

