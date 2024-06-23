/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRuleGroupSubscriptionRequest extends AbstractModel {

    /**
    * Rule Group ID
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * Subscriber Information
    */
    @SerializedName("Receivers")
    @Expose
    private SubscribeReceiver [] Receivers;

    /**
    * Data Subscription Type
    */
    @SerializedName("SubscribeType")
    @Expose
    private Long [] SubscribeType;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Database ID
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * Data Source ID
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * Data Table ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * Group Robot Webhook Information
    */
    @SerializedName("WebHooks")
    @Expose
    private SubscribeWebHook [] WebHooks;

    /**
     * Get Rule Group ID 
     * @return RuleGroupId Rule Group ID
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set Rule Group ID
     * @param RuleGroupId Rule Group ID
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get Subscriber Information 
     * @return Receivers Subscriber Information
     */
    public SubscribeReceiver [] getReceivers() {
        return this.Receivers;
    }

    /**
     * Set Subscriber Information
     * @param Receivers Subscriber Information
     */
    public void setReceivers(SubscribeReceiver [] Receivers) {
        this.Receivers = Receivers;
    }

    /**
     * Get Data Subscription Type 
     * @return SubscribeType Data Subscription Type
     */
    public Long [] getSubscribeType() {
        return this.SubscribeType;
    }

    /**
     * Set Data Subscription Type
     * @param SubscribeType Data Subscription Type
     */
    public void setSubscribeType(Long [] SubscribeType) {
        this.SubscribeType = SubscribeType;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Database ID 
     * @return DatabaseId Database ID
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set Database ID
     * @param DatabaseId Database ID
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get Data Source ID 
     * @return DatasourceId Data Source ID
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set Data Source ID
     * @param DatasourceId Data Source ID
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get Data Table ID 
     * @return TableId Data Table ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set Data Table ID
     * @param TableId Data Table ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get Group Robot Webhook Information 
     * @return WebHooks Group Robot Webhook Information
     */
    public SubscribeWebHook [] getWebHooks() {
        return this.WebHooks;
    }

    /**
     * Set Group Robot Webhook Information
     * @param WebHooks Group Robot Webhook Information
     */
    public void setWebHooks(SubscribeWebHook [] WebHooks) {
        this.WebHooks = WebHooks;
    }

    public ModifyRuleGroupSubscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleGroupSubscriptionRequest(ModifyRuleGroupSubscriptionRequest source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.Receivers != null) {
            this.Receivers = new SubscribeReceiver[source.Receivers.length];
            for (int i = 0; i < source.Receivers.length; i++) {
                this.Receivers[i] = new SubscribeReceiver(source.Receivers[i]);
            }
        }
        if (source.SubscribeType != null) {
            this.SubscribeType = new Long[source.SubscribeType.length];
            for (int i = 0; i < source.SubscribeType.length; i++) {
                this.SubscribeType[i] = new Long(source.SubscribeType[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.WebHooks != null) {
            this.WebHooks = new SubscribeWebHook[source.WebHooks.length];
            for (int i = 0; i < source.WebHooks.length; i++) {
                this.WebHooks[i] = new SubscribeWebHook(source.WebHooks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamArrayObj(map, prefix + "Receivers.", this.Receivers);
        this.setParamArraySimple(map, prefix + "SubscribeType.", this.SubscribeType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamArrayObj(map, prefix + "WebHooks.", this.WebHooks);

    }
}

