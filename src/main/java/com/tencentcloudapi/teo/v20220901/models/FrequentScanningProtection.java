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
    * Whether high-frequency scan protection is enabled. Valid values: <li>on: enabled, the high-frequency scan protection rule takes effect;</li><li>off: disabled, the high-frequency scan protection rule does not take effect.</li>	
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Rule ID of high-frequency scan protection, returned only as an output parameter.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Handling action for high frequency scan protection. When Enabled is on, this field is required. The Name parameter of SecurityAction supports: <li>Deny: block and respond with an Interception page;</li><li>Monitor: observe, do not process request records, and log security events;</li><li>JSChallenge: javascript challenge and respond with a JavaScript challenge page.</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * Match mode for request statistics. This field is required when Enabled is on. Valid values: <li>http.request.xff_header_ip: client ip (priority match xff header);</li><li>http.request.ip: client ip.</li>
    */
    @SerializedName("CountBy")
    @Expose
    private String CountBy;

    /**
    * This parameter specifies the threshold for high-frequency scan protection, which is the total interception count when managed rules configured for interception are hit within the time range set by CountingPeriod. The value ranges from 1 to 4294967294, for example, 100. When this statistical value is exceeded, subsequent requests trigger the handling action set by Action. This field is required when Enabled is on.
    */
    @SerializedName("BlockThreshold")
    @Expose
    private Long BlockThreshold;

    /**
    * This parameter specifies the time window for high-frequency scan protection statistics, that is, the statistical time window for requests that hit managed rules configured for interception. Value range: 5-1800. The unit only supports seconds (s), for example, 5s. Required when Enabled is on.
    */
    @SerializedName("CountingPeriod")
    @Expose
    private String CountingPeriod;

    /**
    * This parameter specifies the duration of the handling Action set by the high frequency scan protection Action parameter. The value ranges from 60 to 86400. The unit only supports seconds (s), for example, 60s. This field is required when Enabled is on.
    */
    @SerializedName("ActionDuration")
    @Expose
    private String ActionDuration;

    /**
     * Get Whether high-frequency scan protection is enabled. Valid values: <li>on: enabled, the high-frequency scan protection rule takes effect;</li><li>off: disabled, the high-frequency scan protection rule does not take effect.</li>	 
     * @return Enabled Whether high-frequency scan protection is enabled. Valid values: <li>on: enabled, the high-frequency scan protection rule takes effect;</li><li>off: disabled, the high-frequency scan protection rule does not take effect.</li>	
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether high-frequency scan protection is enabled. Valid values: <li>on: enabled, the high-frequency scan protection rule takes effect;</li><li>off: disabled, the high-frequency scan protection rule does not take effect.</li>	
     * @param Enabled Whether high-frequency scan protection is enabled. Valid values: <li>on: enabled, the high-frequency scan protection rule takes effect;</li><li>off: disabled, the high-frequency scan protection rule does not take effect.</li>	
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Rule ID of high-frequency scan protection, returned only as an output parameter. 
     * @return Id Rule ID of high-frequency scan protection, returned only as an output parameter.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Rule ID of high-frequency scan protection, returned only as an output parameter.
     * @param Id Rule ID of high-frequency scan protection, returned only as an output parameter.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Handling action for high frequency scan protection. When Enabled is on, this field is required. The Name parameter of SecurityAction supports: <li>Deny: block and respond with an Interception page;</li><li>Monitor: observe, do not process request records, and log security events;</li><li>JSChallenge: javascript challenge and respond with a JavaScript challenge page.</li> 
     * @return Action Handling action for high frequency scan protection. When Enabled is on, this field is required. The Name parameter of SecurityAction supports: <li>Deny: block and respond with an Interception page;</li><li>Monitor: observe, do not process request records, and log security events;</li><li>JSChallenge: javascript challenge and respond with a JavaScript challenge page.</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Handling action for high frequency scan protection. When Enabled is on, this field is required. The Name parameter of SecurityAction supports: <li>Deny: block and respond with an Interception page;</li><li>Monitor: observe, do not process request records, and log security events;</li><li>JSChallenge: javascript challenge and respond with a JavaScript challenge page.</li>
     * @param Action Handling action for high frequency scan protection. When Enabled is on, this field is required. The Name parameter of SecurityAction supports: <li>Deny: block and respond with an Interception page;</li><li>Monitor: observe, do not process request records, and log security events;</li><li>JSChallenge: javascript challenge and respond with a JavaScript challenge page.</li>
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get Match mode for request statistics. This field is required when Enabled is on. Valid values: <li>http.request.xff_header_ip: client ip (priority match xff header);</li><li>http.request.ip: client ip.</li> 
     * @return CountBy Match mode for request statistics. This field is required when Enabled is on. Valid values: <li>http.request.xff_header_ip: client ip (priority match xff header);</li><li>http.request.ip: client ip.</li>
     */
    public String getCountBy() {
        return this.CountBy;
    }

    /**
     * Set Match mode for request statistics. This field is required when Enabled is on. Valid values: <li>http.request.xff_header_ip: client ip (priority match xff header);</li><li>http.request.ip: client ip.</li>
     * @param CountBy Match mode for request statistics. This field is required when Enabled is on. Valid values: <li>http.request.xff_header_ip: client ip (priority match xff header);</li><li>http.request.ip: client ip.</li>
     */
    public void setCountBy(String CountBy) {
        this.CountBy = CountBy;
    }

    /**
     * Get This parameter specifies the threshold for high-frequency scan protection, which is the total interception count when managed rules configured for interception are hit within the time range set by CountingPeriod. The value ranges from 1 to 4294967294, for example, 100. When this statistical value is exceeded, subsequent requests trigger the handling action set by Action. This field is required when Enabled is on. 
     * @return BlockThreshold This parameter specifies the threshold for high-frequency scan protection, which is the total interception count when managed rules configured for interception are hit within the time range set by CountingPeriod. The value ranges from 1 to 4294967294, for example, 100. When this statistical value is exceeded, subsequent requests trigger the handling action set by Action. This field is required when Enabled is on.
     */
    public Long getBlockThreshold() {
        return this.BlockThreshold;
    }

    /**
     * Set This parameter specifies the threshold for high-frequency scan protection, which is the total interception count when managed rules configured for interception are hit within the time range set by CountingPeriod. The value ranges from 1 to 4294967294, for example, 100. When this statistical value is exceeded, subsequent requests trigger the handling action set by Action. This field is required when Enabled is on.
     * @param BlockThreshold This parameter specifies the threshold for high-frequency scan protection, which is the total interception count when managed rules configured for interception are hit within the time range set by CountingPeriod. The value ranges from 1 to 4294967294, for example, 100. When this statistical value is exceeded, subsequent requests trigger the handling action set by Action. This field is required when Enabled is on.
     */
    public void setBlockThreshold(Long BlockThreshold) {
        this.BlockThreshold = BlockThreshold;
    }

    /**
     * Get This parameter specifies the time window for high-frequency scan protection statistics, that is, the statistical time window for requests that hit managed rules configured for interception. Value range: 5-1800. The unit only supports seconds (s), for example, 5s. Required when Enabled is on. 
     * @return CountingPeriod This parameter specifies the time window for high-frequency scan protection statistics, that is, the statistical time window for requests that hit managed rules configured for interception. Value range: 5-1800. The unit only supports seconds (s), for example, 5s. Required when Enabled is on.
     */
    public String getCountingPeriod() {
        return this.CountingPeriod;
    }

    /**
     * Set This parameter specifies the time window for high-frequency scan protection statistics, that is, the statistical time window for requests that hit managed rules configured for interception. Value range: 5-1800. The unit only supports seconds (s), for example, 5s. Required when Enabled is on.
     * @param CountingPeriod This parameter specifies the time window for high-frequency scan protection statistics, that is, the statistical time window for requests that hit managed rules configured for interception. Value range: 5-1800. The unit only supports seconds (s), for example, 5s. Required when Enabled is on.
     */
    public void setCountingPeriod(String CountingPeriod) {
        this.CountingPeriod = CountingPeriod;
    }

    /**
     * Get This parameter specifies the duration of the handling Action set by the high frequency scan protection Action parameter. The value ranges from 60 to 86400. The unit only supports seconds (s), for example, 60s. This field is required when Enabled is on. 
     * @return ActionDuration This parameter specifies the duration of the handling Action set by the high frequency scan protection Action parameter. The value ranges from 60 to 86400. The unit only supports seconds (s), for example, 60s. This field is required when Enabled is on.
     */
    public String getActionDuration() {
        return this.ActionDuration;
    }

    /**
     * Set This parameter specifies the duration of the handling Action set by the high frequency scan protection Action parameter. The value ranges from 60 to 86400. The unit only supports seconds (s), for example, 60s. This field is required when Enabled is on.
     * @param ActionDuration This parameter specifies the duration of the handling Action set by the high frequency scan protection Action parameter. The value ranges from 60 to 86400. The unit only supports seconds (s), for example, 60s. This field is required when Enabled is on.
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
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "CountBy", this.CountBy);
        this.setParamSimple(map, prefix + "BlockThreshold", this.BlockThreshold);
        this.setParamSimple(map, prefix + "CountingPeriod", this.CountingPeriod);
        this.setParamSimple(map, prefix + "ActionDuration", this.ActionDuration);

    }
}

