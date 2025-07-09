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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IncrementalMigrationHttpOriginConfig extends AbstractModel {

    /**
    * Origin information for back-to-source.
    */
    @SerializedName("OriginInfo")
    @Expose
    private IncrementalMigrationHttpOriginInfo OriginInfo;

    /**
    * Back-to-source parameters.
    */
    @SerializedName("OriginParameter")
    @Expose
    private IncrementalMigrationHttpOriginParameter OriginParameter;

    /**
    * Back-to-source mode. Valid values:
<li>SYNC: Synchronous back-to-source;</li>
<li>ASYNC: Asynchronous back-to-source.</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Back-to-source conditions.
    */
    @SerializedName("OriginCondition")
    @Expose
    private IncrementalMigrationHttpOriginCondition OriginCondition;

    /**
     * Get Origin information for back-to-source. 
     * @return OriginInfo Origin information for back-to-source.
     */
    public IncrementalMigrationHttpOriginInfo getOriginInfo() {
        return this.OriginInfo;
    }

    /**
     * Set Origin information for back-to-source.
     * @param OriginInfo Origin information for back-to-source.
     */
    public void setOriginInfo(IncrementalMigrationHttpOriginInfo OriginInfo) {
        this.OriginInfo = OriginInfo;
    }

    /**
     * Get Back-to-source parameters. 
     * @return OriginParameter Back-to-source parameters.
     */
    public IncrementalMigrationHttpOriginParameter getOriginParameter() {
        return this.OriginParameter;
    }

    /**
     * Set Back-to-source parameters.
     * @param OriginParameter Back-to-source parameters.
     */
    public void setOriginParameter(IncrementalMigrationHttpOriginParameter OriginParameter) {
        this.OriginParameter = OriginParameter;
    }

    /**
     * Get Back-to-source mode. Valid values:
<li>SYNC: Synchronous back-to-source;</li>
<li>ASYNC: Asynchronous back-to-source.</li> 
     * @return Mode Back-to-source mode. Valid values:
<li>SYNC: Synchronous back-to-source;</li>
<li>ASYNC: Asynchronous back-to-source.</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set Back-to-source mode. Valid values:
<li>SYNC: Synchronous back-to-source;</li>
<li>ASYNC: Asynchronous back-to-source.</li>
     * @param Mode Back-to-source mode. Valid values:
<li>SYNC: Synchronous back-to-source;</li>
<li>ASYNC: Asynchronous back-to-source.</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Back-to-source conditions. 
     * @return OriginCondition Back-to-source conditions.
     */
    public IncrementalMigrationHttpOriginCondition getOriginCondition() {
        return this.OriginCondition;
    }

    /**
     * Set Back-to-source conditions.
     * @param OriginCondition Back-to-source conditions.
     */
    public void setOriginCondition(IncrementalMigrationHttpOriginCondition OriginCondition) {
        this.OriginCondition = OriginCondition;
    }

    public IncrementalMigrationHttpOriginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IncrementalMigrationHttpOriginConfig(IncrementalMigrationHttpOriginConfig source) {
        if (source.OriginInfo != null) {
            this.OriginInfo = new IncrementalMigrationHttpOriginInfo(source.OriginInfo);
        }
        if (source.OriginParameter != null) {
            this.OriginParameter = new IncrementalMigrationHttpOriginParameter(source.OriginParameter);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.OriginCondition != null) {
            this.OriginCondition = new IncrementalMigrationHttpOriginCondition(source.OriginCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "OriginInfo.", this.OriginInfo);
        this.setParamObj(map, prefix + "OriginParameter.", this.OriginParameter);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamObj(map, prefix + "OriginCondition.", this.OriginCondition);

    }
}

