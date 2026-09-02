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

public class DspmRiskCount extends AbstractModel {

    /**
    * Number of Pending Risks
    */
    @SerializedName("UnprocessedRisk")
    @Expose
    private Long UnprocessedRisk;

    /**
    * Configuration risk count
    */
    @SerializedName("ConfigurationRisk")
    @Expose
    private Long ConfigurationRisk;

    /**
    * Baseline risk count
    */
    @SerializedName("BaselineDeviation")
    @Expose
    private Long BaselineDeviation;

    /**
    * Number of leakage risks
    */
    @SerializedName("LeakDetection")
    @Expose
    private Long LeakDetection;

    /**
    * Number of SQL abnormal behavior risks
    */
    @SerializedName("SQLBehaviorAnomaly")
    @Expose
    private Long SQLBehaviorAnomaly;

    /**
    * Number of permission exception risks
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
    * Number of sensitive operations on the account
    */
    @SerializedName("AccountSensitiveOperation")
    @Expose
    private Long AccountSensitiveOperation;

    /**
    * Pending alarm count
    */
    @SerializedName("UnprocessedAlarm")
    @Expose
    private Long UnprocessedAlarm;

    /**
    * Newly-added event alarm
    */
    @SerializedName("NumOfNewAlarmEvent")
    @Expose
    private Long NumOfNewAlarmEvent;

    /**
    * Newly-added configuration risk
    */
    @SerializedName("NumOfNewConfigRisk")
    @Expose
    private Long NumOfNewConfigRisk;

    /**
     * Get Number of Pending Risks 
     * @return UnprocessedRisk Number of Pending Risks
     */
    public Long getUnprocessedRisk() {
        return this.UnprocessedRisk;
    }

    /**
     * Set Number of Pending Risks
     * @param UnprocessedRisk Number of Pending Risks
     */
    public void setUnprocessedRisk(Long UnprocessedRisk) {
        this.UnprocessedRisk = UnprocessedRisk;
    }

    /**
     * Get Configuration risk count 
     * @return ConfigurationRisk Configuration risk count
     * @deprecated
     */
    @Deprecated
    public Long getConfigurationRisk() {
        return this.ConfigurationRisk;
    }

    /**
     * Set Configuration risk count
     * @param ConfigurationRisk Configuration risk count
     * @deprecated
     */
    @Deprecated
    public void setConfigurationRisk(Long ConfigurationRisk) {
        this.ConfigurationRisk = ConfigurationRisk;
    }

    /**
     * Get Baseline risk count 
     * @return BaselineDeviation Baseline risk count
     * @deprecated
     */
    @Deprecated
    public Long getBaselineDeviation() {
        return this.BaselineDeviation;
    }

    /**
     * Set Baseline risk count
     * @param BaselineDeviation Baseline risk count
     * @deprecated
     */
    @Deprecated
    public void setBaselineDeviation(Long BaselineDeviation) {
        this.BaselineDeviation = BaselineDeviation;
    }

    /**
     * Get Number of leakage risks 
     * @return LeakDetection Number of leakage risks
     * @deprecated
     */
    @Deprecated
    public Long getLeakDetection() {
        return this.LeakDetection;
    }

    /**
     * Set Number of leakage risks
     * @param LeakDetection Number of leakage risks
     * @deprecated
     */
    @Deprecated
    public void setLeakDetection(Long LeakDetection) {
        this.LeakDetection = LeakDetection;
    }

    /**
     * Get Number of SQL abnormal behavior risks 
     * @return SQLBehaviorAnomaly Number of SQL abnormal behavior risks
     */
    public Long getSQLBehaviorAnomaly() {
        return this.SQLBehaviorAnomaly;
    }

    /**
     * Set Number of SQL abnormal behavior risks
     * @param SQLBehaviorAnomaly Number of SQL abnormal behavior risks
     */
    public void setSQLBehaviorAnomaly(Long SQLBehaviorAnomaly) {
        this.SQLBehaviorAnomaly = SQLBehaviorAnomaly;
    }

    /**
     * Get Number of permission exception risks 
     * @return PermissionAnomaly Number of permission exception risks
     */
    public Long getPermissionAnomaly() {
        return this.PermissionAnomaly;
    }

    /**
     * Set Number of permission exception risks
     * @param PermissionAnomaly Number of permission exception risks
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
     * Get Number of sensitive operations on the account 
     * @return AccountSensitiveOperation Number of sensitive operations on the account
     */
    public Long getAccountSensitiveOperation() {
        return this.AccountSensitiveOperation;
    }

    /**
     * Set Number of sensitive operations on the account
     * @param AccountSensitiveOperation Number of sensitive operations on the account
     */
    public void setAccountSensitiveOperation(Long AccountSensitiveOperation) {
        this.AccountSensitiveOperation = AccountSensitiveOperation;
    }

    /**
     * Get Pending alarm count 
     * @return UnprocessedAlarm Pending alarm count
     */
    public Long getUnprocessedAlarm() {
        return this.UnprocessedAlarm;
    }

    /**
     * Set Pending alarm count
     * @param UnprocessedAlarm Pending alarm count
     */
    public void setUnprocessedAlarm(Long UnprocessedAlarm) {
        this.UnprocessedAlarm = UnprocessedAlarm;
    }

    /**
     * Get Newly-added event alarm 
     * @return NumOfNewAlarmEvent Newly-added event alarm
     */
    public Long getNumOfNewAlarmEvent() {
        return this.NumOfNewAlarmEvent;
    }

    /**
     * Set Newly-added event alarm
     * @param NumOfNewAlarmEvent Newly-added event alarm
     */
    public void setNumOfNewAlarmEvent(Long NumOfNewAlarmEvent) {
        this.NumOfNewAlarmEvent = NumOfNewAlarmEvent;
    }

    /**
     * Get Newly-added configuration risk 
     * @return NumOfNewConfigRisk Newly-added configuration risk
     */
    public Long getNumOfNewConfigRisk() {
        return this.NumOfNewConfigRisk;
    }

    /**
     * Set Newly-added configuration risk
     * @param NumOfNewConfigRisk Newly-added configuration risk
     */
    public void setNumOfNewConfigRisk(Long NumOfNewConfigRisk) {
        this.NumOfNewConfigRisk = NumOfNewConfigRisk;
    }

    public DspmRiskCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmRiskCount(DspmRiskCount source) {
        if (source.UnprocessedRisk != null) {
            this.UnprocessedRisk = new Long(source.UnprocessedRisk);
        }
        if (source.ConfigurationRisk != null) {
            this.ConfigurationRisk = new Long(source.ConfigurationRisk);
        }
        if (source.BaselineDeviation != null) {
            this.BaselineDeviation = new Long(source.BaselineDeviation);
        }
        if (source.LeakDetection != null) {
            this.LeakDetection = new Long(source.LeakDetection);
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
        if (source.UnprocessedAlarm != null) {
            this.UnprocessedAlarm = new Long(source.UnprocessedAlarm);
        }
        if (source.NumOfNewAlarmEvent != null) {
            this.NumOfNewAlarmEvent = new Long(source.NumOfNewAlarmEvent);
        }
        if (source.NumOfNewConfigRisk != null) {
            this.NumOfNewConfigRisk = new Long(source.NumOfNewConfigRisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnprocessedRisk", this.UnprocessedRisk);
        this.setParamSimple(map, prefix + "ConfigurationRisk", this.ConfigurationRisk);
        this.setParamSimple(map, prefix + "BaselineDeviation", this.BaselineDeviation);
        this.setParamSimple(map, prefix + "LeakDetection", this.LeakDetection);
        this.setParamSimple(map, prefix + "SQLBehaviorAnomaly", this.SQLBehaviorAnomaly);
        this.setParamSimple(map, prefix + "PermissionAnomaly", this.PermissionAnomaly);
        this.setParamSimple(map, prefix + "LoginBehaviorAnomaly", this.LoginBehaviorAnomaly);
        this.setParamSimple(map, prefix + "AttackSurfaceRisk", this.AttackSurfaceRisk);
        this.setParamSimple(map, prefix + "AccountSensitiveOperation", this.AccountSensitiveOperation);
        this.setParamSimple(map, prefix + "UnprocessedAlarm", this.UnprocessedAlarm);
        this.setParamSimple(map, prefix + "NumOfNewAlarmEvent", this.NumOfNewAlarmEvent);
        this.setParamSimple(map, prefix + "NumOfNewConfigRisk", this.NumOfNewConfigRisk);

    }
}

