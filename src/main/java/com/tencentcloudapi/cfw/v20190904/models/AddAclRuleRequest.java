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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddAclRuleRequest extends AbstractModel {

    /**
    * The list of Internet boundary rules to be added cannot be empty. Each rule must meet the requirements for direction, source and target, action, scope, protocol port, and template restrictions. The entire request must also comply with rule quota and effective rule count limitations. Account-related values must come from read-only queries: for address templates, call DescribeAddressTemplateList, filter the request with TemplateType=1 or 5, and confirm that the returned Data[].Type is 1 or 5. Write Data[].Uuid (with the mb_ prefix) to the corresponding Content, and do not use Data[].TemplateId (with the ip-/dm- prefix). For protocol port templates, filter the request with TemplateType=6, and write Data[].TemplateId (with the pp- prefix) to ParamTemplateId. For asset instances, call DescribeCfwAssets, parse the returned results, and use assets[].instance_id. For asset groups, call DescribeResourceGroupNew, pass QueryType=resource, GroupId="0", ShowType=all, parse the returned results, and use GroupId. For resource tags, pass QueryType=tag, skip the "all assets" root node, and construct JSON using the first-level node GroupName as the Key and the selected second-level sub-node GroupName as the Value, without writing GroupId. For regions, call DescribeAclRegInfo: for Scope=serial, pass FwType=["SERIAL"]; for Scope=side, pass FwType=["BYPASS"]; for Scope=all, pass both items simultaneously, and use Data[].RegionCode. Do not use display names or manually concatenate values. The range for overwrite import is determined solely by the Direction of the first rule.
    */
    @SerializedName("Rules")
    @Expose
    private CreateRuleItem [] Rules;

    /**
    * <p>AI operation source</p><p>Enumeration value:</p><ul><li>console: console source value</li><li>wechat: WeChat</li></ul>
    */
    @SerializedName("CfwAiAgentOperationSource")
    @Expose
    private String CfwAiAgentOperationSource;

    /**
    * Add method. Omit or an empty string means ordinary addition; insert_rule means adding new at a specified position; batch_import means non-overwrite batch import; batch_import_cover means overwrite import, which deletes the existing operation rule corresponding to the first rule's Direction and then adds Rules. Deleted rules will not be restored if addition fails, with extremely high risk. The coverage area is only determined by the first rule. The caller must ensure the Directions of the Rules match. Only the above values are supported.
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
     * Get The list of Internet boundary rules to be added cannot be empty. Each rule must meet the requirements for direction, source and target, action, scope, protocol port, and template restrictions. The entire request must also comply with rule quota and effective rule count limitations. Account-related values must come from read-only queries: for address templates, call DescribeAddressTemplateList, filter the request with TemplateType=1 or 5, and confirm that the returned Data[].Type is 1 or 5. Write Data[].Uuid (with the mb_ prefix) to the corresponding Content, and do not use Data[].TemplateId (with the ip-/dm- prefix). For protocol port templates, filter the request with TemplateType=6, and write Data[].TemplateId (with the pp- prefix) to ParamTemplateId. For asset instances, call DescribeCfwAssets, parse the returned results, and use assets[].instance_id. For asset groups, call DescribeResourceGroupNew, pass QueryType=resource, GroupId="0", ShowType=all, parse the returned results, and use GroupId. For resource tags, pass QueryType=tag, skip the "all assets" root node, and construct JSON using the first-level node GroupName as the Key and the selected second-level sub-node GroupName as the Value, without writing GroupId. For regions, call DescribeAclRegInfo: for Scope=serial, pass FwType=["SERIAL"]; for Scope=side, pass FwType=["BYPASS"]; for Scope=all, pass both items simultaneously, and use Data[].RegionCode. Do not use display names or manually concatenate values. The range for overwrite import is determined solely by the Direction of the first rule. 
     * @return Rules The list of Internet boundary rules to be added cannot be empty. Each rule must meet the requirements for direction, source and target, action, scope, protocol port, and template restrictions. The entire request must also comply with rule quota and effective rule count limitations. Account-related values must come from read-only queries: for address templates, call DescribeAddressTemplateList, filter the request with TemplateType=1 or 5, and confirm that the returned Data[].Type is 1 or 5. Write Data[].Uuid (with the mb_ prefix) to the corresponding Content, and do not use Data[].TemplateId (with the ip-/dm- prefix). For protocol port templates, filter the request with TemplateType=6, and write Data[].TemplateId (with the pp- prefix) to ParamTemplateId. For asset instances, call DescribeCfwAssets, parse the returned results, and use assets[].instance_id. For asset groups, call DescribeResourceGroupNew, pass QueryType=resource, GroupId="0", ShowType=all, parse the returned results, and use GroupId. For resource tags, pass QueryType=tag, skip the "all assets" root node, and construct JSON using the first-level node GroupName as the Key and the selected second-level sub-node GroupName as the Value, without writing GroupId. For regions, call DescribeAclRegInfo: for Scope=serial, pass FwType=["SERIAL"]; for Scope=side, pass FwType=["BYPASS"]; for Scope=all, pass both items simultaneously, and use Data[].RegionCode. Do not use display names or manually concatenate values. The range for overwrite import is determined solely by the Direction of the first rule.
     */
    public CreateRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set The list of Internet boundary rules to be added cannot be empty. Each rule must meet the requirements for direction, source and target, action, scope, protocol port, and template restrictions. The entire request must also comply with rule quota and effective rule count limitations. Account-related values must come from read-only queries: for address templates, call DescribeAddressTemplateList, filter the request with TemplateType=1 or 5, and confirm that the returned Data[].Type is 1 or 5. Write Data[].Uuid (with the mb_ prefix) to the corresponding Content, and do not use Data[].TemplateId (with the ip-/dm- prefix). For protocol port templates, filter the request with TemplateType=6, and write Data[].TemplateId (with the pp- prefix) to ParamTemplateId. For asset instances, call DescribeCfwAssets, parse the returned results, and use assets[].instance_id. For asset groups, call DescribeResourceGroupNew, pass QueryType=resource, GroupId="0", ShowType=all, parse the returned results, and use GroupId. For resource tags, pass QueryType=tag, skip the "all assets" root node, and construct JSON using the first-level node GroupName as the Key and the selected second-level sub-node GroupName as the Value, without writing GroupId. For regions, call DescribeAclRegInfo: for Scope=serial, pass FwType=["SERIAL"]; for Scope=side, pass FwType=["BYPASS"]; for Scope=all, pass both items simultaneously, and use Data[].RegionCode. Do not use display names or manually concatenate values. The range for overwrite import is determined solely by the Direction of the first rule.
     * @param Rules The list of Internet boundary rules to be added cannot be empty. Each rule must meet the requirements for direction, source and target, action, scope, protocol port, and template restrictions. The entire request must also comply with rule quota and effective rule count limitations. Account-related values must come from read-only queries: for address templates, call DescribeAddressTemplateList, filter the request with TemplateType=1 or 5, and confirm that the returned Data[].Type is 1 or 5. Write Data[].Uuid (with the mb_ prefix) to the corresponding Content, and do not use Data[].TemplateId (with the ip-/dm- prefix). For protocol port templates, filter the request with TemplateType=6, and write Data[].TemplateId (with the pp- prefix) to ParamTemplateId. For asset instances, call DescribeCfwAssets, parse the returned results, and use assets[].instance_id. For asset groups, call DescribeResourceGroupNew, pass QueryType=resource, GroupId="0", ShowType=all, parse the returned results, and use GroupId. For resource tags, pass QueryType=tag, skip the "all assets" root node, and construct JSON using the first-level node GroupName as the Key and the selected second-level sub-node GroupName as the Value, without writing GroupId. For regions, call DescribeAclRegInfo: for Scope=serial, pass FwType=["SERIAL"]; for Scope=side, pass FwType=["BYPASS"]; for Scope=all, pass both items simultaneously, and use Data[].RegionCode. Do not use display names or manually concatenate values. The range for overwrite import is determined solely by the Direction of the first rule.
     */
    public void setRules(CreateRuleItem [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get <p>AI operation source</p><p>Enumeration value:</p><ul><li>console: console source value</li><li>wechat: WeChat</li></ul> 
     * @return CfwAiAgentOperationSource <p>AI operation source</p><p>Enumeration value:</p><ul><li>console: console source value</li><li>wechat: WeChat</li></ul>
     */
    public String getCfwAiAgentOperationSource() {
        return this.CfwAiAgentOperationSource;
    }

    /**
     * Set <p>AI operation source</p><p>Enumeration value:</p><ul><li>console: console source value</li><li>wechat: WeChat</li></ul>
     * @param CfwAiAgentOperationSource <p>AI operation source</p><p>Enumeration value:</p><ul><li>console: console source value</li><li>wechat: WeChat</li></ul>
     */
    public void setCfwAiAgentOperationSource(String CfwAiAgentOperationSource) {
        this.CfwAiAgentOperationSource = CfwAiAgentOperationSource;
    }

    /**
     * Get Add method. Omit or an empty string means ordinary addition; insert_rule means adding new at a specified position; batch_import means non-overwrite batch import; batch_import_cover means overwrite import, which deletes the existing operation rule corresponding to the first rule's Direction and then adds Rules. Deleted rules will not be restored if addition fails, with extremely high risk. The coverage area is only determined by the first rule. The caller must ensure the Directions of the Rules match. Only the above values are supported. 
     * @return From Add method. Omit or an empty string means ordinary addition; insert_rule means adding new at a specified position; batch_import means non-overwrite batch import; batch_import_cover means overwrite import, which deletes the existing operation rule corresponding to the first rule's Direction and then adds Rules. Deleted rules will not be restored if addition fails, with extremely high risk. The coverage area is only determined by the first rule. The caller must ensure the Directions of the Rules match. Only the above values are supported.
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Add method. Omit or an empty string means ordinary addition; insert_rule means adding new at a specified position; batch_import means non-overwrite batch import; batch_import_cover means overwrite import, which deletes the existing operation rule corresponding to the first rule's Direction and then adds Rules. Deleted rules will not be restored if addition fails, with extremely high risk. The coverage area is only determined by the first rule. The caller must ensure the Directions of the Rules match. Only the above values are supported.
     * @param From Add method. Omit or an empty string means ordinary addition; insert_rule means adding new at a specified position; batch_import means non-overwrite batch import; batch_import_cover means overwrite import, which deletes the existing operation rule corresponding to the first rule's Direction and then adds Rules. Deleted rules will not be restored if addition fails, with extremely high risk. The coverage area is only determined by the first rule. The caller must ensure the Directions of the Rules match. Only the above values are supported.
     */
    public void setFrom(String From) {
        this.From = From;
    }

    public AddAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddAclRuleRequest(AddAclRuleRequest source) {
        if (source.Rules != null) {
            this.Rules = new CreateRuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new CreateRuleItem(source.Rules[i]);
            }
        }
        if (source.CfwAiAgentOperationSource != null) {
            this.CfwAiAgentOperationSource = new String(source.CfwAiAgentOperationSource);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "CfwAiAgentOperationSource", this.CfwAiAgentOperationSource);
        this.setParamSimple(map, prefix + "From", this.From);

    }
}

