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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmRiskTendency extends AbstractModel {

    /**
    * Date
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Number of unmanaged accounts
    */
    @SerializedName("UncontrolledAccount")
    @Expose
    private Long UncontrolledAccount;

    /**
    * Number of configuration risks
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * Baseline risk count
    */
    @SerializedName("BaselineRisk")
    @Expose
    private Long BaselineRisk;

    /**
    * Number of leakage risks
    */
    @SerializedName("LeakDetectionRisk")
    @Expose
    private Long LeakDetectionRisk;

    /**
    * Number of SQL behavior anomaly risks
    */
    @SerializedName("SQLBehaviorAnomaly")
    @Expose
    private Long SQLBehaviorAnomaly;

    /**
    * Number of permission abnormal risks
    */
    @SerializedName("PermissionAnomaly")
    @Expose
    private Long PermissionAnomaly;

    /**
    * Number of login behavior anomaly risks
    */
    @SerializedName("LoginBehaviorAnomaly")
    @Expose
    private Long LoginBehaviorAnomaly;

    /**
    * Number of attack surface risks
    */
    @SerializedName("AttackSurfaceRisk")
    @Expose
    private Long AttackSurfaceRisk;

    /**
    * Number of sensitive operations for the account
    */
    @SerializedName("AccountSensitiveOperation")
    @Expose
    private Long AccountSensitiveOperation;

    /**
     * Get Date 
     * @return Date Date
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date
     * @param Date Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Number of unmanaged accounts 
     * @return UncontrolledAccount Number of unmanaged accounts
     */
    public Long getUncontrolledAccount() {
        return this.UncontrolledAccount;
    }

    /**
     * Set Number of unmanaged accounts
     * @param UncontrolledAccount Number of unmanaged accounts
     */
    public void setUncontrolledAccount(Long UncontrolledAccount) {
        this.UncontrolledAccount = UncontrolledAccount;
    }

    /**
     * Get Number of configuration risks 
     * @return ConfigurationRisk Number of configuration risks
     * @deprecated
     */
    @Deprecated
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set Number of configuration risks
     * @param ConfigurationRisk Number of configuration risks
     * @deprecated
     */
    @Deprecated
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get Baseline risk count 
     * @return BaselineRisk Baseline risk count
     * @deprecated
     */
    @Deprecated
    public Long getBaselineRisk() {
        return this.BaselineRisk;
    }

    /**
     * Set Baseline risk count
     * @param BaselineRisk Baseline risk count
     * @deprecated
     */
    @Deprecated
    public void setBaselineRisk(Long BaselineRisk) {
        this.BaselineRisk = BaselineRisk;
    }

    /**
     * Get Number of leakage risks 
     * @return LeakDetectionRisk Number of leakage risks
     * @deprecated
     */
    @Deprecated
    public Long getLeakDetectionRisk() {
        return this.LeakDetectionRisk;
    }

    /**
     * Set Number of leakage risks
     * @param LeakDetectionRisk Number of leakage risks
     * @deprecated
     */
    @Deprecated
    public void setLeakDetectionRisk(Long LeakDetectionRisk) {
        this.LeakDetectionRisk = LeakDetectionRisk;
    }

    /**
     * Get Number of SQL behavior anomaly risks 
     * @return SQLBehaviorAnomaly Number of SQL behavior anomaly risks
     */
    public Long getSQLBehaviorAnomaly() {
        return this.SQLBehaviorAnomaly;
    }

    /**
     * Set Number of SQL behavior anomaly risks
     * @param SQLBehaviorAnomaly Number of SQL behavior anomaly risks
     */
    public void setSQLBehaviorAnomaly(Long SQLBehaviorAnomaly) {
        this.SQLBehaviorAnomaly = SQLBehaviorAnomaly;
    }

    /**
     * Get Number of permission abnormal risks 
     * @return PermissionAnomaly Number of permission abnormal risks
     */
    public Long getPermissionAnomaly() {
        return this.PermissionAnomaly;
    }

    /**
     * Set Number of permission abnormal risks
     * @param PermissionAnomaly Number of permission abnormal risks
     */
    public void setPermissionAnomaly(Long PermissionAnomaly) {
        this.PermissionAnomaly = PermissionAnomaly;
    }

    /**
     * Get Number of login behavior anomaly risks 
     * @return LoginBehaviorAnomaly Number of login behavior anomaly risks
     */
    public Long getLoginBehaviorAnomaly() {
        return this.LoginBehaviorAnomaly;
    }

    /**
     * Set Number of login behavior anomaly risks
     * @param LoginBehaviorAnomaly Number of login behavior anomaly risks
     */
    public void setLoginBehaviorAnomaly(Long LoginBehaviorAnomaly) {
        this.LoginBehaviorAnomaly = LoginBehaviorAnomaly;
    }

    /**
     * Get Number of attack surface risks 
     * @return AttackSurfaceRisk Number of attack surface risks
     */
    public Long getAttackSurfaceRisk() {
        return this.AttackSurfaceRisk;
    }

    /**
     * Set Number of attack surface risks
     * @param AttackSurfaceRisk Number of attack surface risks
     */
    public void setAttackSurfaceRisk(Long AttackSurfaceRisk) {
        this.AttackSurfaceRisk = AttackSurfaceRisk;
    }

    /**
     * Get Number of sensitive operations for the account 
     * @return AccountSensitiveOperation Number of sensitive operations for the account
     */
    public Long getAccountSensitiveOperation() {
        return this.AccountSensitiveOperation;
    }

    /**
     * Set Number of sensitive operations for the account
     * @param AccountSensitiveOperation Number of sensitive operations for the account
     */
    public void setAccountSensitiveOperation(Long AccountSensitiveOperation) {
        this.AccountSensitiveOperation = AccountSensitiveOperation;
    }

    public DspmRiskTendency() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmRiskTendency(DspmRiskTendency source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.UncontrolledAccount != null) {
            this.UncontrolledAccount = new Long(source.UncontrolledAccount);
        }
        if (source.ConfigurationRisk != null) {
            this.ConfigurationRisk = new Long(source.ConfigurationRisk);
        }
        if (source.BaselineRisk != null) {
            this.BaselineRisk = new Long(source.BaselineRisk);
        }
        if (source.LeakDetectionRisk != null) {
            this.LeakDetectionRisk = new Long(source.LeakDetectionRisk);
        }
        if (source.SQLBehaviorAnomaly != null) {
            this.SQLBehaviorAnomaly = new Long(source.SQLBehaviorAnomaly);
        }
        if (source.PermissionAnomaly != null) {
            this.PermissionAnomaly = new Long(source.PermissionAnomaly);
        }
        if (source.LoginBehaviorAnomaly != null) {
            this.LoginBehaviorAnomaly = new Long(source.LoginBehaviorAnomaly);
        }
        if (source.AttackSurfaceRisk != null) {
            this.AttackSurfaceRisk = new Long(source.AttackSurfaceRisk);
        }
        if (source.AccountSensitiveOperation != null) {
            this.AccountSensitiveOperation = new Long(source.AccountSensitiveOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "UncontrolledAccount", this.UncontrolledAccount);
        this.setParamSimple(map, prefix + "ConfigurationRisk", this.ConfigurationRisk);
        this.setParamSimple(map, prefix + "BaselineRisk", this.BaselineRisk);
        this.setParamSimple(map, prefix + "LeakDetectionRisk", this.LeakDetectionRisk);
        this.setParamSimple(map, prefix + "SQLBehaviorAnomaly", this.SQLBehaviorAnomaly);
        this.setParamSimple(map, prefix + "PermissionAnomaly", this.PermissionAnomaly);
        this.setParamSimple(map, prefix + "LoginBehaviorAnomaly", this.LoginBehaviorAnomaly);
        this.setParamSimple(map, prefix + "AttackSurfaceRisk", this.AttackSurfaceRisk);
        this.setParamSimple(map, prefix + "AccountSensitiveOperation", this.AccountSensitiveOperation);

    }
}

