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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleAction extends AbstractModel {

    /**
    * Forward action execution sequence. Must be unique and in ascending order. Value range: 1-50000.
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * Forwarding action type. Valid values:
TargetGroup: Forward to a target group.
Redirect: Redirection.
FixedResponse: returns fixed content.
Rewrite: Rewrite.
InsertHeader: Write to HTTP Header.
RemoveHeader: Delete HTTP Header.
The forward action must include one of TargetGroup, Redirect, or FixedResponse, and the execution order must be placed last.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Fixed response content configuration.
    */
    @SerializedName("FixedResponseConfig")
    @Expose
    private FixedResponseInfo FixedResponseConfig;

    /**
    * Insert HTTP Header configuration.
    */
    @SerializedName("InsertHeaderConfig")
    @Expose
    private InsertHTTPHeaderInfo InsertHeaderConfig;

    /**
    * Redirection configuration. Except for HttpCode, other configuration cannot all use default values.
    */
    @SerializedName("RedirectConfig")
    @Expose
    private HTTPRedirectInfo RedirectConfig;

    /**
    * Delete HTTP Header configuration.
    */
    @SerializedName("RemoveHeaderConfig")
    @Expose
    private RemoveHTTPHeaderInfo RemoveHeaderConfig;

    /**
    * Rewrite the configuration.
    */
    @SerializedName("RewriteConfig")
    @Expose
    private HTTPRewriteInfo RewriteConfig;

    /**
    * Forwarding target group configuration.
    */
    @SerializedName("TargetGroupConfig")
    @Expose
    private TargetGroupConfig TargetGroupConfig;

    /**
     * Get Forward action execution sequence. Must be unique and in ascending order. Value range: 1-50000. 
     * @return Order Forward action execution sequence. Must be unique and in ascending order. Value range: 1-50000.
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set Forward action execution sequence. Must be unique and in ascending order. Value range: 1-50000.
     * @param Order Forward action execution sequence. Must be unique and in ascending order. Value range: 1-50000.
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get Forwarding action type. Valid values:
TargetGroup: Forward to a target group.
Redirect: Redirection.
FixedResponse: returns fixed content.
Rewrite: Rewrite.
InsertHeader: Write to HTTP Header.
RemoveHeader: Delete HTTP Header.
The forward action must include one of TargetGroup, Redirect, or FixedResponse, and the execution order must be placed last. 
     * @return Type Forwarding action type. Valid values:
TargetGroup: Forward to a target group.
Redirect: Redirection.
FixedResponse: returns fixed content.
Rewrite: Rewrite.
InsertHeader: Write to HTTP Header.
RemoveHeader: Delete HTTP Header.
The forward action must include one of TargetGroup, Redirect, or FixedResponse, and the execution order must be placed last.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Forwarding action type. Valid values:
TargetGroup: Forward to a target group.
Redirect: Redirection.
FixedResponse: returns fixed content.
Rewrite: Rewrite.
InsertHeader: Write to HTTP Header.
RemoveHeader: Delete HTTP Header.
The forward action must include one of TargetGroup, Redirect, or FixedResponse, and the execution order must be placed last.
     * @param Type Forwarding action type. Valid values:
TargetGroup: Forward to a target group.
Redirect: Redirection.
FixedResponse: returns fixed content.
Rewrite: Rewrite.
InsertHeader: Write to HTTP Header.
RemoveHeader: Delete HTTP Header.
The forward action must include one of TargetGroup, Redirect, or FixedResponse, and the execution order must be placed last.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Fixed response content configuration. 
     * @return FixedResponseConfig Fixed response content configuration.
     */
    public FixedResponseInfo getFixedResponseConfig() {
        return this.FixedResponseConfig;
    }

    /**
     * Set Fixed response content configuration.
     * @param FixedResponseConfig Fixed response content configuration.
     */
    public void setFixedResponseConfig(FixedResponseInfo FixedResponseConfig) {
        this.FixedResponseConfig = FixedResponseConfig;
    }

    /**
     * Get Insert HTTP Header configuration. 
     * @return InsertHeaderConfig Insert HTTP Header configuration.
     */
    public InsertHTTPHeaderInfo getInsertHeaderConfig() {
        return this.InsertHeaderConfig;
    }

    /**
     * Set Insert HTTP Header configuration.
     * @param InsertHeaderConfig Insert HTTP Header configuration.
     */
    public void setInsertHeaderConfig(InsertHTTPHeaderInfo InsertHeaderConfig) {
        this.InsertHeaderConfig = InsertHeaderConfig;
    }

    /**
     * Get Redirection configuration. Except for HttpCode, other configuration cannot all use default values. 
     * @return RedirectConfig Redirection configuration. Except for HttpCode, other configuration cannot all use default values.
     */
    public HTTPRedirectInfo getRedirectConfig() {
        return this.RedirectConfig;
    }

    /**
     * Set Redirection configuration. Except for HttpCode, other configuration cannot all use default values.
     * @param RedirectConfig Redirection configuration. Except for HttpCode, other configuration cannot all use default values.
     */
    public void setRedirectConfig(HTTPRedirectInfo RedirectConfig) {
        this.RedirectConfig = RedirectConfig;
    }

    /**
     * Get Delete HTTP Header configuration. 
     * @return RemoveHeaderConfig Delete HTTP Header configuration.
     */
    public RemoveHTTPHeaderInfo getRemoveHeaderConfig() {
        return this.RemoveHeaderConfig;
    }

    /**
     * Set Delete HTTP Header configuration.
     * @param RemoveHeaderConfig Delete HTTP Header configuration.
     */
    public void setRemoveHeaderConfig(RemoveHTTPHeaderInfo RemoveHeaderConfig) {
        this.RemoveHeaderConfig = RemoveHeaderConfig;
    }

    /**
     * Get Rewrite the configuration. 
     * @return RewriteConfig Rewrite the configuration.
     */
    public HTTPRewriteInfo getRewriteConfig() {
        return this.RewriteConfig;
    }

    /**
     * Set Rewrite the configuration.
     * @param RewriteConfig Rewrite the configuration.
     */
    public void setRewriteConfig(HTTPRewriteInfo RewriteConfig) {
        this.RewriteConfig = RewriteConfig;
    }

    /**
     * Get Forwarding target group configuration. 
     * @return TargetGroupConfig Forwarding target group configuration.
     */
    public TargetGroupConfig getTargetGroupConfig() {
        return this.TargetGroupConfig;
    }

    /**
     * Set Forwarding target group configuration.
     * @param TargetGroupConfig Forwarding target group configuration.
     */
    public void setTargetGroupConfig(TargetGroupConfig TargetGroupConfig) {
        this.TargetGroupConfig = TargetGroupConfig;
    }

    public RuleAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleAction(RuleAction source) {
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FixedResponseConfig != null) {
            this.FixedResponseConfig = new FixedResponseInfo(source.FixedResponseConfig);
        }
        if (source.InsertHeaderConfig != null) {
            this.InsertHeaderConfig = new InsertHTTPHeaderInfo(source.InsertHeaderConfig);
        }
        if (source.RedirectConfig != null) {
            this.RedirectConfig = new HTTPRedirectInfo(source.RedirectConfig);
        }
        if (source.RemoveHeaderConfig != null) {
            this.RemoveHeaderConfig = new RemoveHTTPHeaderInfo(source.RemoveHeaderConfig);
        }
        if (source.RewriteConfig != null) {
            this.RewriteConfig = new HTTPRewriteInfo(source.RewriteConfig);
        }
        if (source.TargetGroupConfig != null) {
            this.TargetGroupConfig = new TargetGroupConfig(source.TargetGroupConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "FixedResponseConfig.", this.FixedResponseConfig);
        this.setParamObj(map, prefix + "InsertHeaderConfig.", this.InsertHeaderConfig);
        this.setParamObj(map, prefix + "RedirectConfig.", this.RedirectConfig);
        this.setParamObj(map, prefix + "RemoveHeaderConfig.", this.RemoveHeaderConfig);
        this.setParamObj(map, prefix + "RewriteConfig.", this.RewriteConfig);
        this.setParamObj(map, prefix + "TargetGroupConfig.", this.TargetGroupConfig);

    }
}

