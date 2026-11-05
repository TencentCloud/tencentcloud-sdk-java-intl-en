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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocLifecycle extends AbstractModel {

    /**
    * <p>Creation time (Unix seconds).</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Expiration policy (validity time and behavior after the validity period expires)</p>
    */
    @SerializedName("ExpirationPolicy")
    @Expose
    private ExpirationPolicy ExpirationPolicy;

    /**
    * <p>Document status: 1=parsing, 2=parsing failure, 3=import failed, 4=under review, 5=review failure, 6=Learning, 7=learning failed, 8=import complete, 9=expired, 10=quota invalid, 11=quota recovering, 12=rename review failure, 13=rename appeal failure, 14=manual appeal in progress, 15=manual appeal failure<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOC_STATUS_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_STATUS_PARSING</td><td>1</td><td>Parsing</td></tr><tr><td>DOC_STATUS_PARSE_FAIL</td><td>2</td><td>Parsing failure</td></tr><tr><td>DOC_STATUS_IMPORT_FAIL</td><td>3</td><td>Import failed</td></tr><tr><td>DOC_STATUS_AUDITING</td><td>4</td><td>Under review</td></tr><tr><td>DOC_STATUS_AUDIT_FAIL</td><td>5</td><td>Review failure</td></tr><tr><td>DOC_STATUS_LEARNING</td><td>6</td><td>Learning</td></tr><tr><td>DOC_STATUS_LEARN_FAIL</td><td>7</td><td>Learning failed</td></tr><tr><td>DOC_STATUS_IMPORTED</td><td>8</td><td>Import complete</td></tr><tr><td>DOC_STATUS_EXPIRED</td><td>9</td><td>Expired</td></tr><tr><td>DOC_STATUS_QUOTA_INVALID</td><td>10</td><td>Quota invalid</td></tr><tr><td>DOC_STATUS_QUOTA_RECOVERING</td><td>11</td><td>Quota recovering</td></tr><tr><td>DOC_STATUS_RENAME_AUDIT_FAIL</td><td>12</td><td>Rename review failure</td></tr><tr><td>DOC_STATUS_RENAME_APPEAL_FAIL</td><td>13</td><td>Rename appeal failure</td></tr><tr><td>DOC_STATUS_MANUAL_APPEALING</td><td>14</td><td>Manual appeal in progress</td></tr><tr><td>DOC_STATUS_MANUAL_APPEAL_FAIL</td><td>15</td><td>Manual appeal failure</td></tr></tbody></table></p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>Status description</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>Status additional information</p>
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * <p>Update time (Unix seconds)</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Creation time (Unix seconds).</p> 
     * @return CreateTime <p>Creation time (Unix seconds).</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time (Unix seconds).</p>
     * @param CreateTime <p>Creation time (Unix seconds).</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Expiration policy (validity time and behavior after the validity period expires)</p> 
     * @return ExpirationPolicy <p>Expiration policy (validity time and behavior after the validity period expires)</p>
     */
    public ExpirationPolicy getExpirationPolicy() {
        return this.ExpirationPolicy;
    }

    /**
     * Set <p>Expiration policy (validity time and behavior after the validity period expires)</p>
     * @param ExpirationPolicy <p>Expiration policy (validity time and behavior after the validity period expires)</p>
     */
    public void setExpirationPolicy(ExpirationPolicy ExpirationPolicy) {
        this.ExpirationPolicy = ExpirationPolicy;
    }

    /**
     * Get <p>Document status: 1=parsing, 2=parsing failure, 3=import failed, 4=under review, 5=review failure, 6=Learning, 7=learning failed, 8=import complete, 9=expired, 10=quota invalid, 11=quota recovering, 12=rename review failure, 13=rename appeal failure, 14=manual appeal in progress, 15=manual appeal failure<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOC_STATUS_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_STATUS_PARSING</td><td>1</td><td>Parsing</td></tr><tr><td>DOC_STATUS_PARSE_FAIL</td><td>2</td><td>Parsing failure</td></tr><tr><td>DOC_STATUS_IMPORT_FAIL</td><td>3</td><td>Import failed</td></tr><tr><td>DOC_STATUS_AUDITING</td><td>4</td><td>Under review</td></tr><tr><td>DOC_STATUS_AUDIT_FAIL</td><td>5</td><td>Review failure</td></tr><tr><td>DOC_STATUS_LEARNING</td><td>6</td><td>Learning</td></tr><tr><td>DOC_STATUS_LEARN_FAIL</td><td>7</td><td>Learning failed</td></tr><tr><td>DOC_STATUS_IMPORTED</td><td>8</td><td>Import complete</td></tr><tr><td>DOC_STATUS_EXPIRED</td><td>9</td><td>Expired</td></tr><tr><td>DOC_STATUS_QUOTA_INVALID</td><td>10</td><td>Quota invalid</td></tr><tr><td>DOC_STATUS_QUOTA_RECOVERING</td><td>11</td><td>Quota recovering</td></tr><tr><td>DOC_STATUS_RENAME_AUDIT_FAIL</td><td>12</td><td>Rename review failure</td></tr><tr><td>DOC_STATUS_RENAME_APPEAL_FAIL</td><td>13</td><td>Rename appeal failure</td></tr><tr><td>DOC_STATUS_MANUAL_APPEALING</td><td>14</td><td>Manual appeal in progress</td></tr><tr><td>DOC_STATUS_MANUAL_APPEAL_FAIL</td><td>15</td><td>Manual appeal failure</td></tr></tbody></table></p> 
     * @return Status <p>Document status: 1=parsing, 2=parsing failure, 3=import failed, 4=under review, 5=review failure, 6=Learning, 7=learning failed, 8=import complete, 9=expired, 10=quota invalid, 11=quota recovering, 12=rename review failure, 13=rename appeal failure, 14=manual appeal in progress, 15=manual appeal failure<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOC_STATUS_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_STATUS_PARSING</td><td>1</td><td>Parsing</td></tr><tr><td>DOC_STATUS_PARSE_FAIL</td><td>2</td><td>Parsing failure</td></tr><tr><td>DOC_STATUS_IMPORT_FAIL</td><td>3</td><td>Import failed</td></tr><tr><td>DOC_STATUS_AUDITING</td><td>4</td><td>Under review</td></tr><tr><td>DOC_STATUS_AUDIT_FAIL</td><td>5</td><td>Review failure</td></tr><tr><td>DOC_STATUS_LEARNING</td><td>6</td><td>Learning</td></tr><tr><td>DOC_STATUS_LEARN_FAIL</td><td>7</td><td>Learning failed</td></tr><tr><td>DOC_STATUS_IMPORTED</td><td>8</td><td>Import complete</td></tr><tr><td>DOC_STATUS_EXPIRED</td><td>9</td><td>Expired</td></tr><tr><td>DOC_STATUS_QUOTA_INVALID</td><td>10</td><td>Quota invalid</td></tr><tr><td>DOC_STATUS_QUOTA_RECOVERING</td><td>11</td><td>Quota recovering</td></tr><tr><td>DOC_STATUS_RENAME_AUDIT_FAIL</td><td>12</td><td>Rename review failure</td></tr><tr><td>DOC_STATUS_RENAME_APPEAL_FAIL</td><td>13</td><td>Rename appeal failure</td></tr><tr><td>DOC_STATUS_MANUAL_APPEALING</td><td>14</td><td>Manual appeal in progress</td></tr><tr><td>DOC_STATUS_MANUAL_APPEAL_FAIL</td><td>15</td><td>Manual appeal failure</td></tr></tbody></table></p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Document status: 1=parsing, 2=parsing failure, 3=import failed, 4=under review, 5=review failure, 6=Learning, 7=learning failed, 8=import complete, 9=expired, 10=quota invalid, 11=quota recovering, 12=rename review failure, 13=rename appeal failure, 14=manual appeal in progress, 15=manual appeal failure<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOC_STATUS_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_STATUS_PARSING</td><td>1</td><td>Parsing</td></tr><tr><td>DOC_STATUS_PARSE_FAIL</td><td>2</td><td>Parsing failure</td></tr><tr><td>DOC_STATUS_IMPORT_FAIL</td><td>3</td><td>Import failed</td></tr><tr><td>DOC_STATUS_AUDITING</td><td>4</td><td>Under review</td></tr><tr><td>DOC_STATUS_AUDIT_FAIL</td><td>5</td><td>Review failure</td></tr><tr><td>DOC_STATUS_LEARNING</td><td>6</td><td>Learning</td></tr><tr><td>DOC_STATUS_LEARN_FAIL</td><td>7</td><td>Learning failed</td></tr><tr><td>DOC_STATUS_IMPORTED</td><td>8</td><td>Import complete</td></tr><tr><td>DOC_STATUS_EXPIRED</td><td>9</td><td>Expired</td></tr><tr><td>DOC_STATUS_QUOTA_INVALID</td><td>10</td><td>Quota invalid</td></tr><tr><td>DOC_STATUS_QUOTA_RECOVERING</td><td>11</td><td>Quota recovering</td></tr><tr><td>DOC_STATUS_RENAME_AUDIT_FAIL</td><td>12</td><td>Rename review failure</td></tr><tr><td>DOC_STATUS_RENAME_APPEAL_FAIL</td><td>13</td><td>Rename appeal failure</td></tr><tr><td>DOC_STATUS_MANUAL_APPEALING</td><td>14</td><td>Manual appeal in progress</td></tr><tr><td>DOC_STATUS_MANUAL_APPEAL_FAIL</td><td>15</td><td>Manual appeal failure</td></tr></tbody></table></p>
     * @param Status <p>Document status: 1=parsing, 2=parsing failure, 3=import failed, 4=under review, 5=review failure, 6=Learning, 7=learning failed, 8=import complete, 9=expired, 10=quota invalid, 11=quota recovering, 12=rename review failure, 13=rename appeal failure, 14=manual appeal in progress, 15=manual appeal failure<table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>DOC_STATUS_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_STATUS_PARSING</td><td>1</td><td>Parsing</td></tr><tr><td>DOC_STATUS_PARSE_FAIL</td><td>2</td><td>Parsing failure</td></tr><tr><td>DOC_STATUS_IMPORT_FAIL</td><td>3</td><td>Import failed</td></tr><tr><td>DOC_STATUS_AUDITING</td><td>4</td><td>Under review</td></tr><tr><td>DOC_STATUS_AUDIT_FAIL</td><td>5</td><td>Review failure</td></tr><tr><td>DOC_STATUS_LEARNING</td><td>6</td><td>Learning</td></tr><tr><td>DOC_STATUS_LEARN_FAIL</td><td>7</td><td>Learning failed</td></tr><tr><td>DOC_STATUS_IMPORTED</td><td>8</td><td>Import complete</td></tr><tr><td>DOC_STATUS_EXPIRED</td><td>9</td><td>Expired</td></tr><tr><td>DOC_STATUS_QUOTA_INVALID</td><td>10</td><td>Quota invalid</td></tr><tr><td>DOC_STATUS_QUOTA_RECOVERING</td><td>11</td><td>Quota recovering</td></tr><tr><td>DOC_STATUS_RENAME_AUDIT_FAIL</td><td>12</td><td>Rename review failure</td></tr><tr><td>DOC_STATUS_RENAME_APPEAL_FAIL</td><td>13</td><td>Rename appeal failure</td></tr><tr><td>DOC_STATUS_MANUAL_APPEALING</td><td>14</td><td>Manual appeal in progress</td></tr><tr><td>DOC_STATUS_MANUAL_APPEAL_FAIL</td><td>15</td><td>Manual appeal failure</td></tr></tbody></table></p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Status description</p> 
     * @return StatusDesc <p>Status description</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>Status description</p>
     * @param StatusDesc <p>Status description</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>Status additional information</p> 
     * @return StatusMessage <p>Status additional information</p>
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set <p>Status additional information</p>
     * @param StatusMessage <p>Status additional information</p>
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Get <p>Update time (Unix seconds)</p> 
     * @return UpdateTime <p>Update time (Unix seconds)</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Update time (Unix seconds)</p>
     * @param UpdateTime <p>Update time (Unix seconds)</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DocLifecycle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocLifecycle(DocLifecycle source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpirationPolicy != null) {
            this.ExpirationPolicy = new ExpirationPolicy(source.ExpirationPolicy);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.StatusMessage != null) {
            this.StatusMessage = new String(source.StatusMessage);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "ExpirationPolicy.", this.ExpirationPolicy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

