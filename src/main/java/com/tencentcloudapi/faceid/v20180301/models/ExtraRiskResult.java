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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraRiskResult extends AbstractModel {

    /**
    * <p>Completion of the additional checks in this request, indicating whether the result can be trusted.</p><p>Valid values:</p><ul><li>Completed: Conclusions (matched or passed) have been given for all checks required by this request.</li><li>Partial: At least one check cannot reach a conclusion due to unavailable dependencies, insufficient data, or incomplete or invalid input parameters. The result is for reference only and does not indicate security.</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Additional risk level, which may be an empty string.</p><p>Valid values:</p><ul><li>High: An effective risk match exists (RiskDetailList is not empty in this case).</li><li>Low: The check is completed and no match is confirmed.</li><li>&quot;&quot; (empty string): Unrecognized. No check in this request can reach a conclusion, or not all checks are completed. It indicates neither risk nor security.</li></ul>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>List of matched risk items. An empty array [] is returned if no risk item is matched.</p>
    */
    @SerializedName("BlackListResult")
    @Expose
    private BlackListItem [] BlackListResult;

    /**
    * <p>Face blocklist match details. An empty array [] is returned if no match is found.</p>
    */
    @SerializedName("RiskDetailList")
    @Expose
    private RiskDetailItem [] RiskDetailList;

    /**
     * Get <p>Completion of the additional checks in this request, indicating whether the result can be trusted.</p><p>Valid values:</p><ul><li>Completed: Conclusions (matched or passed) have been given for all checks required by this request.</li><li>Partial: At least one check cannot reach a conclusion due to unavailable dependencies, insufficient data, or incomplete or invalid input parameters. The result is for reference only and does not indicate security.</li></ul> 
     * @return Status <p>Completion of the additional checks in this request, indicating whether the result can be trusted.</p><p>Valid values:</p><ul><li>Completed: Conclusions (matched or passed) have been given for all checks required by this request.</li><li>Partial: At least one check cannot reach a conclusion due to unavailable dependencies, insufficient data, or incomplete or invalid input parameters. The result is for reference only and does not indicate security.</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Completion of the additional checks in this request, indicating whether the result can be trusted.</p><p>Valid values:</p><ul><li>Completed: Conclusions (matched or passed) have been given for all checks required by this request.</li><li>Partial: At least one check cannot reach a conclusion due to unavailable dependencies, insufficient data, or incomplete or invalid input parameters. The result is for reference only and does not indicate security.</li></ul>
     * @param Status <p>Completion of the additional checks in this request, indicating whether the result can be trusted.</p><p>Valid values:</p><ul><li>Completed: Conclusions (matched or passed) have been given for all checks required by this request.</li><li>Partial: At least one check cannot reach a conclusion due to unavailable dependencies, insufficient data, or incomplete or invalid input parameters. The result is for reference only and does not indicate security.</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Additional risk level, which may be an empty string.</p><p>Valid values:</p><ul><li>High: An effective risk match exists (RiskDetailList is not empty in this case).</li><li>Low: The check is completed and no match is confirmed.</li><li>&quot;&quot; (empty string): Unrecognized. No check in this request can reach a conclusion, or not all checks are completed. It indicates neither risk nor security.</li></ul> 
     * @return RiskLevel <p>Additional risk level, which may be an empty string.</p><p>Valid values:</p><ul><li>High: An effective risk match exists (RiskDetailList is not empty in this case).</li><li>Low: The check is completed and no match is confirmed.</li><li>&quot;&quot; (empty string): Unrecognized. No check in this request can reach a conclusion, or not all checks are completed. It indicates neither risk nor security.</li></ul>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>Additional risk level, which may be an empty string.</p><p>Valid values:</p><ul><li>High: An effective risk match exists (RiskDetailList is not empty in this case).</li><li>Low: The check is completed and no match is confirmed.</li><li>&quot;&quot; (empty string): Unrecognized. No check in this request can reach a conclusion, or not all checks are completed. It indicates neither risk nor security.</li></ul>
     * @param RiskLevel <p>Additional risk level, which may be an empty string.</p><p>Valid values:</p><ul><li>High: An effective risk match exists (RiskDetailList is not empty in this case).</li><li>Low: The check is completed and no match is confirmed.</li><li>&quot;&quot; (empty string): Unrecognized. No check in this request can reach a conclusion, or not all checks are completed. It indicates neither risk nor security.</li></ul>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>List of matched risk items. An empty array [] is returned if no risk item is matched.</p> 
     * @return BlackListResult <p>List of matched risk items. An empty array [] is returned if no risk item is matched.</p>
     */
    public BlackListItem [] getBlackListResult() {
        return this.BlackListResult;
    }

    /**
     * Set <p>List of matched risk items. An empty array [] is returned if no risk item is matched.</p>
     * @param BlackListResult <p>List of matched risk items. An empty array [] is returned if no risk item is matched.</p>
     */
    public void setBlackListResult(BlackListItem [] BlackListResult) {
        this.BlackListResult = BlackListResult;
    }

    /**
     * Get <p>Face blocklist match details. An empty array [] is returned if no match is found.</p> 
     * @return RiskDetailList <p>Face blocklist match details. An empty array [] is returned if no match is found.</p>
     */
    public RiskDetailItem [] getRiskDetailList() {
        return this.RiskDetailList;
    }

    /**
     * Set <p>Face blocklist match details. An empty array [] is returned if no match is found.</p>
     * @param RiskDetailList <p>Face blocklist match details. An empty array [] is returned if no match is found.</p>
     */
    public void setRiskDetailList(RiskDetailItem [] RiskDetailList) {
        this.RiskDetailList = RiskDetailList;
    }

    public ExtraRiskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraRiskResult(ExtraRiskResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.BlackListResult != null) {
            this.BlackListResult = new BlackListItem[source.BlackListResult.length];
            for (int i = 0; i < source.BlackListResult.length; i++) {
                this.BlackListResult[i] = new BlackListItem(source.BlackListResult[i]);
            }
        }
        if (source.RiskDetailList != null) {
            this.RiskDetailList = new RiskDetailItem[source.RiskDetailList.length];
            for (int i = 0; i < source.RiskDetailList.length; i++) {
                this.RiskDetailList[i] = new RiskDetailItem(source.RiskDetailList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "BlackListResult.", this.BlackListResult);
        this.setParamArrayObj(map, prefix + "RiskDetailList.", this.RiskDetailList);

    }
}

