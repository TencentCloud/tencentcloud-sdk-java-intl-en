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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleGroupTable extends AbstractModel {

    /**
    * Table Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TableInfo")
    @Expose
    private RuleGroupTableInnerInfo TableInfo;

    /**
    * Rule Group Scheduling Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("RuleGroups")
    @Expose
    private RuleGroupSchedulerInfo [] RuleGroups;

    /**
    * Subscriber Information
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Subscriptions")
    @Expose
    private RuleGroupSubscribe [] Subscriptions;

    /**
     * Get Table Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TableInfo Table Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleGroupTableInnerInfo getTableInfo() {
        return this.TableInfo;
    }

    /**
     * Set Table Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TableInfo Table Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTableInfo(RuleGroupTableInnerInfo TableInfo) {
        this.TableInfo = TableInfo;
    }

    /**
     * Get Rule Group Scheduling Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return RuleGroups Rule Group Scheduling Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleGroupSchedulerInfo [] getRuleGroups() {
        return this.RuleGroups;
    }

    /**
     * Set Rule Group Scheduling Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param RuleGroups Rule Group Scheduling Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setRuleGroups(RuleGroupSchedulerInfo [] RuleGroups) {
        this.RuleGroups = RuleGroups;
    }

    /**
     * Get Subscriber Information
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Subscriptions Subscriber Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public RuleGroupSubscribe [] getSubscriptions() {
        return this.Subscriptions;
    }

    /**
     * Set Subscriber Information
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Subscriptions Subscriber Information
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSubscriptions(RuleGroupSubscribe [] Subscriptions) {
        this.Subscriptions = Subscriptions;
    }

    public RuleGroupTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroupTable(RuleGroupTable source) {
        if (source.TableInfo != null) {
            this.TableInfo = new RuleGroupTableInnerInfo(source.TableInfo);
        }
        if (source.RuleGroups != null) {
            this.RuleGroups = new RuleGroupSchedulerInfo[source.RuleGroups.length];
            for (int i = 0; i < source.RuleGroups.length; i++) {
                this.RuleGroups[i] = new RuleGroupSchedulerInfo(source.RuleGroups[i]);
            }
        }
        if (source.Subscriptions != null) {
            this.Subscriptions = new RuleGroupSubscribe[source.Subscriptions.length];
            for (int i = 0; i < source.Subscriptions.length; i++) {
                this.Subscriptions[i] = new RuleGroupSubscribe(source.Subscriptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TableInfo.", this.TableInfo);
        this.setParamArrayObj(map, prefix + "RuleGroups.", this.RuleGroups);
        this.setParamArrayObj(map, prefix + "Subscriptions.", this.Subscriptions);

    }
}

