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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4RuleSource extends AbstractModel {

    /**
    * IP or domain name for forwarding.
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Weight. Value range: [0,100].
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 8000
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Secondary origin server. `1`: secondary origin server; `0`: general origin server.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Backup")
    @Expose
    private Long Backup;

    /**
     * Get IP or domain name for forwarding. 
     * @return Source IP or domain name for forwarding.
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set IP or domain name for forwarding.
     * @param Source IP or domain name for forwarding.
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Weight. Value range: [0,100]. 
     * @return Weight Weight. Value range: [0,100].
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight. Value range: [0,100].
     * @param Weight Weight. Value range: [0,100].
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 8000
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Port 8000
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 8000
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Port 8000
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Secondary origin server. `1`: secondary origin server; `0`: general origin server.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Backup Secondary origin server. `1`: secondary origin server; `0`: general origin server.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getBackup() {
        return this.Backup;
    }

    /**
     * Set Secondary origin server. `1`: secondary origin server; `0`: general origin server.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Backup Secondary origin server. `1`: secondary origin server; `0`: general origin server.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBackup(Long Backup) {
        this.Backup = Backup;
    }

    public L4RuleSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4RuleSource(L4RuleSource source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Backup != null) {
            this.Backup = new Long(source.Backup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Backup", this.Backup);

    }
}

