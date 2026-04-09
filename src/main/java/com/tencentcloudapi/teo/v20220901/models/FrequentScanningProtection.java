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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrequentScanningProtection extends AbstractModel {

    /**
    * Whether the high-frequency scan protection rule is enabled. valid values: <li>on: enable. the high-frequency scan protection rule takes effect.</li><li>off: disable. the high-frequency scan protection rule does not take effect.</li>.	
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * The handling action for high-frequency scan protection. required when Enabled is on. valid values for SecurityAction Name: <li>Deny: block and respond with an interception page;</li> <li>Monitor: observe without processing requests, log security events in logs;</li> <li>JSChallenge: respond with a JavaScript challenge page.</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * The match mode for request statistics. required when Enabled is on. valid values: <li>http.request.xff_header_ip: client ip (priority match xff header);</li><li>http.request.ip: client ip.</li>.
    */
    @SerializedName("CountBy")
    @Expose
    private String CountBy;

    /**
    * This parameter specifies the threshold for high-frequency scan protection, which is the intercept count of managed rules set to interception within the time range set by CountingPeriod. value range: 1 to 4294967294, for example 100. when exceeding this statistical value, subsequent requests will trigger the handling Action set by Action. required when Enabled is on.
    */
    @SerializedName("BlockThreshold")
    @Expose
    private Long BlockThreshold;

    /**
    * This parameter specifies the statistical time window for high-frequency scan protection, which is the time window for counting requests that hit managed rules configured as block. valid values: 5-1800. measurement unit: seconds (s) only, such as 5s. this field is required when Enabled is on.
    */
    @SerializedName("CountingPeriod")
    @Expose
    private String CountingPeriod;

    /**
    * This parameter specifies the duration of the handling Action set by the high frequency scan protection Action parameter. value range: 60 to 86400. measurement unit: seconds (s) only, for example 60s. this field is required when Enabled is on.
    */
    @SerializedName("ActionDuration")
    @Expose
    private String ActionDuration;

    /**
     * Get Whether the high-frequency scan protection rule is enabled. valid values: <li>on: enable. the high-frequency scan protection rule takes effect.</li><li>off: disable. the high-frequency scan protection rule does not take effect.</li>.	 
     * @return Enabled Whether the high-frequency scan protection rule is enabled. valid values: <li>on: enable. the high-frequency scan protection rule takes effect.</li><li>off: disable. the high-frequency scan protection rule does not take effect.</li>.	
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the high-frequency scan protection rule is enabled. valid values: <li>on: enable. the high-frequency scan protection rule takes effect.</li><li>off: disable. the high-frequency scan protection rule does not take effect.</li>.	
     * @param Enabled Whether the high-frequency scan protection rule is enabled. valid values: <li>on: enable. the high-frequency scan protection rule takes effect.</li><li>off: disable. the high-frequency scan protection rule does not take effect.</li>.	
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get The handling action for high-frequency scan protection. required when Enabled is on. valid values for SecurityAction Name: <li>Deny: block and respond with an interception page;</li> <li>Monitor: observe without processing requests, log security events in logs;</li> <li>JSChallenge: respond with a JavaScript challenge page.</li>. 
     * @return Action The handling action for high-frequency scan protection. required when Enabled is on. valid values for SecurityAction Name: <li>Deny: block and respond with an interception page;</li> <li>Monitor: observe without processing requests, log security events in logs;</li> <li>JSChallenge: respond with a JavaScript challenge page.</li>.
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set The handling action for high-frequency scan protection. required when Enabled is on. valid values for SecurityAction Name: <li>Deny: block and respond with an interception page;</li> <li>Monitor: observe without processing requests, log security events in logs;</li> <li>JSChallenge: respond with a JavaScript challenge page.</li>.
     * @param Action The handling action for high-frequency scan protection. required when Enabled is on. valid values for SecurityAction Name: <li>Deny: block and respond with an interception page;</li> <li>Monitor: observe without processing requests, log security events in logs;</li> <li>JSChallenge: respond with a JavaScript challenge page.</li>.
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get The match mode for request statistics. required when Enabled is on. valid values: <li>http.request.xff_header_ip: client ip (priority match xff header);</li><li>http.request.ip: client ip.</li>. 
     * @return CountBy The match mode for request statistics. required when Enabled is on. valid values: <li>http.request.xff_header_ip: client ip (priority match xff header);</li><li>http.request.ip: client ip.</li>.
     */
    public String getCountBy() {
        return this.CountBy;
    }

    /**
     * Set The match mode for request statistics. required when Enabled is on. valid values: <li>http.request.xff_header_ip: client ip (priority match xff header);</li><li>http.request.ip: client ip.</li>.
     * @param CountBy The match mode for request statistics. required when Enabled is on. valid values: <li>http.request.xff_header_ip: client ip (priority match xff header);</li><li>http.request.ip: client ip.</li>.
     */
    public void setCountBy(String CountBy) {
        this.CountBy = CountBy;
    }

    /**
     * Get This parameter specifies the threshold for high-frequency scan protection, which is the intercept count of managed rules set to interception within the time range set by CountingPeriod. value range: 1 to 4294967294, for example 100. when exceeding this statistical value, subsequent requests will trigger the handling Action set by Action. required when Enabled is on. 
     * @return BlockThreshold This parameter specifies the threshold for high-frequency scan protection, which is the intercept count of managed rules set to interception within the time range set by CountingPeriod. value range: 1 to 4294967294, for example 100. when exceeding this statistical value, subsequent requests will trigger the handling Action set by Action. required when Enabled is on.
     */
    public Long getBlockThreshold() {
        return this.BlockThreshold;
    }

    /**
     * Set This parameter specifies the threshold for high-frequency scan protection, which is the intercept count of managed rules set to interception within the time range set by CountingPeriod. value range: 1 to 4294967294, for example 100. when exceeding this statistical value, subsequent requests will trigger the handling Action set by Action. required when Enabled is on.
     * @param BlockThreshold This parameter specifies the threshold for high-frequency scan protection, which is the intercept count of managed rules set to interception within the time range set by CountingPeriod. value range: 1 to 4294967294, for example 100. when exceeding this statistical value, subsequent requests will trigger the handling Action set by Action. required when Enabled is on.
     */
    public void setBlockThreshold(Long BlockThreshold) {
        this.BlockThreshold = BlockThreshold;
    }

    /**
     * Get This parameter specifies the statistical time window for high-frequency scan protection, which is the time window for counting requests that hit managed rules configured as block. valid values: 5-1800. measurement unit: seconds (s) only, such as 5s. this field is required when Enabled is on. 
     * @return CountingPeriod This parameter specifies the statistical time window for high-frequency scan protection, which is the time window for counting requests that hit managed rules configured as block. valid values: 5-1800. measurement unit: seconds (s) only, such as 5s. this field is required when Enabled is on.
     */
    public String getCountingPeriod() {
        return this.CountingPeriod;
    }

    /**
     * Set This parameter specifies the statistical time window for high-frequency scan protection, which is the time window for counting requests that hit managed rules configured as block. valid values: 5-1800. measurement unit: seconds (s) only, such as 5s. this field is required when Enabled is on.
     * @param CountingPeriod This parameter specifies the statistical time window for high-frequency scan protection, which is the time window for counting requests that hit managed rules configured as block. valid values: 5-1800. measurement unit: seconds (s) only, such as 5s. this field is required when Enabled is on.
     */
    public void setCountingPeriod(String CountingPeriod) {
        this.CountingPeriod = CountingPeriod;
    }

    /**
     * Get This parameter specifies the duration of the handling Action set by the high frequency scan protection Action parameter. value range: 60 to 86400. measurement unit: seconds (s) only, for example 60s. this field is required when Enabled is on. 
     * @return ActionDuration This parameter specifies the duration of the handling Action set by the high frequency scan protection Action parameter. value range: 60 to 86400. measurement unit: seconds (s) only, for example 60s. this field is required when Enabled is on.
     */
    public String getActionDuration() {
        return this.ActionDuration;
    }

    /**
     * Set This parameter specifies the duration of the handling Action set by the high frequency scan protection Action parameter. value range: 60 to 86400. measurement unit: seconds (s) only, for example 60s. this field is required when Enabled is on.
     * @param ActionDuration This parameter specifies the duration of the handling Action set by the high frequency scan protection Action parameter. value range: 60 to 86400. measurement unit: seconds (s) only, for example 60s. this field is required when Enabled is on.
     */
    public void setActionDuration(String ActionDuration) {
        this.ActionDuration = ActionDuration;
    }

    public FrequentScanningProtection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrequentScanningProtection(FrequentScanningProtection source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.CountBy != null) {
            this.CountBy = new String(source.CountBy);
        }
        if (source.BlockThreshold != null) {
            this.BlockThreshold = new Long(source.BlockThreshold);
        }
        if (source.CountingPeriod != null) {
            this.CountingPeriod = new String(source.CountingPeriod);
        }
        if (source.ActionDuration != null) {
            this.ActionDuration = new String(source.ActionDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "CountBy", this.CountBy);
        this.setParamSimple(map, prefix + "BlockThreshold", this.BlockThreshold);
        this.setParamSimple(map, prefix + "CountingPeriod", this.CountingPeriod);
        this.setParamSimple(map, prefix + "ActionDuration", this.ActionDuration);

    }
}

