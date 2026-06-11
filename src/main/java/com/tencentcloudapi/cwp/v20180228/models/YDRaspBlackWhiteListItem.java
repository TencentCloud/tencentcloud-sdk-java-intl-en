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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class YDRaspBlackWhiteListItem extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Logical operator. 0: 5 valid regular expression logical ANDs; 1: logical OR.
    */
    @SerializedName("LogicalSymbol")
    @Expose
    private Long LogicalSymbol;

    /**
    * Class name regular expression, which is not matched if empty.
    */
    @SerializedName("ClassNameRegexp")
    @Expose
    private String ClassNameRegexp;

    /**
    * Parent class name regular expression, which is not matched if empty.
    */
    @SerializedName("SuperClassNameRegexp")
    @Expose
    private String SuperClassNameRegexp;

    /**
    * Inherited interface regular expression, which is not matched if empty.
    */
    @SerializedName("InterfacesRegexp")
    @Expose
    private String InterfacesRegexp;

    /**
    * Annotation regular expression, which is not matched if empty.
    */
    @SerializedName("AnnotationsRegexp")
    @Expose
    private String AnnotationsRegexp;

    /**
    * Associated class loader regular expression, which is not matched if empty.
    */
    @SerializedName("LoaderClassNameRegexp")
    @Expose
    private String LoaderClassNameRegexp;

    /**
    * Allowlist type, rasp: vulnerability defense, memshell_scan: Java Webshell scan, memshell_inject: memory shell injection
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * Status (0: valid, 1: deleted, 2: invalid (enabling switch off)).
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Java Webshell scan usage, process historical events, 0: do not process 1: process
    */
    @SerializedName("HandleHistory")
    @Expose
    private Long HandleHistory;

    /**
    * rasp and memory shell injection usage, match content, POC, can be a regular expression (MatchMode=5) or a string.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * rasp and memory shell injection usage, attack source ip, leave unset for all sources, multiple allowed, can have ip ranges, such as: 192.168.57.1/24;172.17.0.1
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Rule name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * rasp and memory shell injection usage, allowlisting method, 0: malicious feature allowlisting, 1: request URL allowlisting
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * RASP and memory shell injection usage, attack type, vul.rasp_attacktype_mapping attack_type_id field
    */
    @SerializedName("AttackType")
    @Expose
    private Long AttackType;

    /**
    * rasp and memory shell injection usage, match mode, 0: exact match, 1: prefix match, 2: suffix matching, 4: arbitrary matching, 5: partial matching, 6: regular expression matching.
    */
    @SerializedName("MatchMode")
    @Expose
    private Long MatchMode;

    /**
    * Effective asset type. 0: Host disabled. 1: Host enabled.
    */
    @SerializedName("CWPEffective")
    @Expose
    private Long CWPEffective;

    /**
    * 0: a set of quuid 1: ALL the Real Server with host authorization
    */
    @SerializedName("CWPScope")
    @Expose
    private Long CWPScope;

    /**
    * Designate the effective host machine
    */
    @SerializedName("CWPQuuids")
    @Expose
    private String [] CWPQuuids;

    /**
    * Effective asset type. 0: Container disabled. 1: Container enabled.
    */
    @SerializedName("TCSSEffective")
    @Expose
    private Long TCSSEffective;

    /**
    * 0: a set of quuid 1: ALL the node with container authorization
    */
    @SerializedName("TCSSScope")
    @Expose
    private Long TCSSScope;

    /**
    * Designate the container node to take effect
    */
    @SerializedName("TCSSQuuids")
    @Expose
    private String [] TCSSQuuids;

    /**
    * Effective asset type. 0: Super node disabled. 1: Super node enabled.
    */
    @SerializedName("EksEffective")
    @Expose
    private Long EksEffective;

    /**
    * 0: a set of quuid 1: ALL the super node with container authorization
    */
    @SerializedName("EksScope")
    @Expose
    private Long EksScope;

    /**
    * Designate the super node where the container takes effect
    */
    @SerializedName("EksNodeUniqueID")
    @Expose
    private String [] EksNodeUniqueID;

    /**
    * Application asset. If global, all hosts. Otherwise, the number of selected host servers.
    */
    @SerializedName("CWPMachinesNums")
    @Expose
    private String CWPMachinesNums;

    /**
    * Application asset. If global, all containers host nodes. Otherwise, select the number of host nodes.
    */
    @SerializedName("TCSSMachinesNums")
    @Expose
    private String TCSSMachinesNums;

    /**
    * Application asset. If global, all super nodes. Otherwise, select the number of nodes.
    */
    @SerializedName("EksMachinesNums")
    @Expose
    private String EksMachinesNums;

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Logical operator. 0: 5 valid regular expression logical ANDs; 1: logical OR. 
     * @return LogicalSymbol Logical operator. 0: 5 valid regular expression logical ANDs; 1: logical OR.
     */
    public Long getLogicalSymbol() {
        return this.LogicalSymbol;
    }

    /**
     * Set Logical operator. 0: 5 valid regular expression logical ANDs; 1: logical OR.
     * @param LogicalSymbol Logical operator. 0: 5 valid regular expression logical ANDs; 1: logical OR.
     */
    public void setLogicalSymbol(Long LogicalSymbol) {
        this.LogicalSymbol = LogicalSymbol;
    }

    /**
     * Get Class name regular expression, which is not matched if empty. 
     * @return ClassNameRegexp Class name regular expression, which is not matched if empty.
     */
    public String getClassNameRegexp() {
        return this.ClassNameRegexp;
    }

    /**
     * Set Class name regular expression, which is not matched if empty.
     * @param ClassNameRegexp Class name regular expression, which is not matched if empty.
     */
    public void setClassNameRegexp(String ClassNameRegexp) {
        this.ClassNameRegexp = ClassNameRegexp;
    }

    /**
     * Get Parent class name regular expression, which is not matched if empty. 
     * @return SuperClassNameRegexp Parent class name regular expression, which is not matched if empty.
     */
    public String getSuperClassNameRegexp() {
        return this.SuperClassNameRegexp;
    }

    /**
     * Set Parent class name regular expression, which is not matched if empty.
     * @param SuperClassNameRegexp Parent class name regular expression, which is not matched if empty.
     */
    public void setSuperClassNameRegexp(String SuperClassNameRegexp) {
        this.SuperClassNameRegexp = SuperClassNameRegexp;
    }

    /**
     * Get Inherited interface regular expression, which is not matched if empty. 
     * @return InterfacesRegexp Inherited interface regular expression, which is not matched if empty.
     */
    public String getInterfacesRegexp() {
        return this.InterfacesRegexp;
    }

    /**
     * Set Inherited interface regular expression, which is not matched if empty.
     * @param InterfacesRegexp Inherited interface regular expression, which is not matched if empty.
     */
    public void setInterfacesRegexp(String InterfacesRegexp) {
        this.InterfacesRegexp = InterfacesRegexp;
    }

    /**
     * Get Annotation regular expression, which is not matched if empty. 
     * @return AnnotationsRegexp Annotation regular expression, which is not matched if empty.
     */
    public String getAnnotationsRegexp() {
        return this.AnnotationsRegexp;
    }

    /**
     * Set Annotation regular expression, which is not matched if empty.
     * @param AnnotationsRegexp Annotation regular expression, which is not matched if empty.
     */
    public void setAnnotationsRegexp(String AnnotationsRegexp) {
        this.AnnotationsRegexp = AnnotationsRegexp;
    }

    /**
     * Get Associated class loader regular expression, which is not matched if empty. 
     * @return LoaderClassNameRegexp Associated class loader regular expression, which is not matched if empty.
     */
    public String getLoaderClassNameRegexp() {
        return this.LoaderClassNameRegexp;
    }

    /**
     * Set Associated class loader regular expression, which is not matched if empty.
     * @param LoaderClassNameRegexp Associated class loader regular expression, which is not matched if empty.
     */
    public void setLoaderClassNameRegexp(String LoaderClassNameRegexp) {
        this.LoaderClassNameRegexp = LoaderClassNameRegexp;
    }

    /**
     * Get Allowlist type, rasp: vulnerability defense, memshell_scan: Java Webshell scan, memshell_inject: memory shell injection 
     * @return Source Allowlist type, rasp: vulnerability defense, memshell_scan: Java Webshell scan, memshell_inject: memory shell injection
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Allowlist type, rasp: vulnerability defense, memshell_scan: Java Webshell scan, memshell_inject: memory shell injection
     * @param Source Allowlist type, rasp: vulnerability defense, memshell_scan: Java Webshell scan, memshell_inject: memory shell injection
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get Status (0: valid, 1: deleted, 2: invalid (enabling switch off)). 
     * @return Status Status (0: valid, 1: deleted, 2: invalid (enabling switch off)).
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status (0: valid, 1: deleted, 2: invalid (enabling switch off)).
     * @param Status Status (0: valid, 1: deleted, 2: invalid (enabling switch off)).
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Java Webshell scan usage, process historical events, 0: do not process 1: process 
     * @return HandleHistory Java Webshell scan usage, process historical events, 0: do not process 1: process
     */
    public Long getHandleHistory() {
        return this.HandleHistory;
    }

    /**
     * Set Java Webshell scan usage, process historical events, 0: do not process 1: process
     * @param HandleHistory Java Webshell scan usage, process historical events, 0: do not process 1: process
     */
    public void setHandleHistory(Long HandleHistory) {
        this.HandleHistory = HandleHistory;
    }

    /**
     * Get rasp and memory shell injection usage, match content, POC, can be a regular expression (MatchMode=5) or a string. 
     * @return Content rasp and memory shell injection usage, match content, POC, can be a regular expression (MatchMode=5) or a string.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set rasp and memory shell injection usage, match content, POC, can be a regular expression (MatchMode=5) or a string.
     * @param Content rasp and memory shell injection usage, match content, POC, can be a regular expression (MatchMode=5) or a string.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get rasp and memory shell injection usage, attack source ip, leave unset for all sources, multiple allowed, can have ip ranges, such as: 192.168.57.1/24;172.17.0.1 
     * @return IP rasp and memory shell injection usage, attack source ip, leave unset for all sources, multiple allowed, can have ip ranges, such as: 192.168.57.1/24;172.17.0.1
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set rasp and memory shell injection usage, attack source ip, leave unset for all sources, multiple allowed, can have ip ranges, such as: 192.168.57.1/24;172.17.0.1
     * @param IP rasp and memory shell injection usage, attack source ip, leave unset for all sources, multiple allowed, can have ip ranges, such as: 192.168.57.1/24;172.17.0.1
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Rule name 
     * @return PolicyName Rule name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Rule name
     * @param PolicyName Rule name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get rasp and memory shell injection usage, allowlisting method, 0: malicious feature allowlisting, 1: request URL allowlisting 
     * @return FilterType rasp and memory shell injection usage, allowlisting method, 0: malicious feature allowlisting, 1: request URL allowlisting
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set rasp and memory shell injection usage, allowlisting method, 0: malicious feature allowlisting, 1: request URL allowlisting
     * @param FilterType rasp and memory shell injection usage, allowlisting method, 0: malicious feature allowlisting, 1: request URL allowlisting
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get RASP and memory shell injection usage, attack type, vul.rasp_attacktype_mapping attack_type_id field 
     * @return AttackType RASP and memory shell injection usage, attack type, vul.rasp_attacktype_mapping attack_type_id field
     */
    public Long getAttackType() {
        return this.AttackType;
    }

    /**
     * Set RASP and memory shell injection usage, attack type, vul.rasp_attacktype_mapping attack_type_id field
     * @param AttackType RASP and memory shell injection usage, attack type, vul.rasp_attacktype_mapping attack_type_id field
     */
    public void setAttackType(Long AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get rasp and memory shell injection usage, match mode, 0: exact match, 1: prefix match, 2: suffix matching, 4: arbitrary matching, 5: partial matching, 6: regular expression matching. 
     * @return MatchMode rasp and memory shell injection usage, match mode, 0: exact match, 1: prefix match, 2: suffix matching, 4: arbitrary matching, 5: partial matching, 6: regular expression matching.
     */
    public Long getMatchMode() {
        return this.MatchMode;
    }

    /**
     * Set rasp and memory shell injection usage, match mode, 0: exact match, 1: prefix match, 2: suffix matching, 4: arbitrary matching, 5: partial matching, 6: regular expression matching.
     * @param MatchMode rasp and memory shell injection usage, match mode, 0: exact match, 1: prefix match, 2: suffix matching, 4: arbitrary matching, 5: partial matching, 6: regular expression matching.
     */
    public void setMatchMode(Long MatchMode) {
        this.MatchMode = MatchMode;
    }

    /**
     * Get Effective asset type. 0: Host disabled. 1: Host enabled. 
     * @return CWPEffective Effective asset type. 0: Host disabled. 1: Host enabled.
     */
    public Long getCWPEffective() {
        return this.CWPEffective;
    }

    /**
     * Set Effective asset type. 0: Host disabled. 1: Host enabled.
     * @param CWPEffective Effective asset type. 0: Host disabled. 1: Host enabled.
     */
    public void setCWPEffective(Long CWPEffective) {
        this.CWPEffective = CWPEffective;
    }

    /**
     * Get 0: a set of quuid 1: ALL the Real Server with host authorization 
     * @return CWPScope 0: a set of quuid 1: ALL the Real Server with host authorization
     */
    public Long getCWPScope() {
        return this.CWPScope;
    }

    /**
     * Set 0: a set of quuid 1: ALL the Real Server with host authorization
     * @param CWPScope 0: a set of quuid 1: ALL the Real Server with host authorization
     */
    public void setCWPScope(Long CWPScope) {
        this.CWPScope = CWPScope;
    }

    /**
     * Get Designate the effective host machine 
     * @return CWPQuuids Designate the effective host machine
     */
    public String [] getCWPQuuids() {
        return this.CWPQuuids;
    }

    /**
     * Set Designate the effective host machine
     * @param CWPQuuids Designate the effective host machine
     */
    public void setCWPQuuids(String [] CWPQuuids) {
        this.CWPQuuids = CWPQuuids;
    }

    /**
     * Get Effective asset type. 0: Container disabled. 1: Container enabled. 
     * @return TCSSEffective Effective asset type. 0: Container disabled. 1: Container enabled.
     */
    public Long getTCSSEffective() {
        return this.TCSSEffective;
    }

    /**
     * Set Effective asset type. 0: Container disabled. 1: Container enabled.
     * @param TCSSEffective Effective asset type. 0: Container disabled. 1: Container enabled.
     */
    public void setTCSSEffective(Long TCSSEffective) {
        this.TCSSEffective = TCSSEffective;
    }

    /**
     * Get 0: a set of quuid 1: ALL the node with container authorization 
     * @return TCSSScope 0: a set of quuid 1: ALL the node with container authorization
     */
    public Long getTCSSScope() {
        return this.TCSSScope;
    }

    /**
     * Set 0: a set of quuid 1: ALL the node with container authorization
     * @param TCSSScope 0: a set of quuid 1: ALL the node with container authorization
     */
    public void setTCSSScope(Long TCSSScope) {
        this.TCSSScope = TCSSScope;
    }

    /**
     * Get Designate the container node to take effect 
     * @return TCSSQuuids Designate the container node to take effect
     */
    public String [] getTCSSQuuids() {
        return this.TCSSQuuids;
    }

    /**
     * Set Designate the container node to take effect
     * @param TCSSQuuids Designate the container node to take effect
     */
    public void setTCSSQuuids(String [] TCSSQuuids) {
        this.TCSSQuuids = TCSSQuuids;
    }

    /**
     * Get Effective asset type. 0: Super node disabled. 1: Super node enabled. 
     * @return EksEffective Effective asset type. 0: Super node disabled. 1: Super node enabled.
     */
    public Long getEksEffective() {
        return this.EksEffective;
    }

    /**
     * Set Effective asset type. 0: Super node disabled. 1: Super node enabled.
     * @param EksEffective Effective asset type. 0: Super node disabled. 1: Super node enabled.
     */
    public void setEksEffective(Long EksEffective) {
        this.EksEffective = EksEffective;
    }

    /**
     * Get 0: a set of quuid 1: ALL the super node with container authorization 
     * @return EksScope 0: a set of quuid 1: ALL the super node with container authorization
     */
    public Long getEksScope() {
        return this.EksScope;
    }

    /**
     * Set 0: a set of quuid 1: ALL the super node with container authorization
     * @param EksScope 0: a set of quuid 1: ALL the super node with container authorization
     */
    public void setEksScope(Long EksScope) {
        this.EksScope = EksScope;
    }

    /**
     * Get Designate the super node where the container takes effect 
     * @return EksNodeUniqueID Designate the super node where the container takes effect
     */
    public String [] getEksNodeUniqueID() {
        return this.EksNodeUniqueID;
    }

    /**
     * Set Designate the super node where the container takes effect
     * @param EksNodeUniqueID Designate the super node where the container takes effect
     */
    public void setEksNodeUniqueID(String [] EksNodeUniqueID) {
        this.EksNodeUniqueID = EksNodeUniqueID;
    }

    /**
     * Get Application asset. If global, all hosts. Otherwise, the number of selected host servers. 
     * @return CWPMachinesNums Application asset. If global, all hosts. Otherwise, the number of selected host servers.
     */
    public String getCWPMachinesNums() {
        return this.CWPMachinesNums;
    }

    /**
     * Set Application asset. If global, all hosts. Otherwise, the number of selected host servers.
     * @param CWPMachinesNums Application asset. If global, all hosts. Otherwise, the number of selected host servers.
     */
    public void setCWPMachinesNums(String CWPMachinesNums) {
        this.CWPMachinesNums = CWPMachinesNums;
    }

    /**
     * Get Application asset. If global, all containers host nodes. Otherwise, select the number of host nodes. 
     * @return TCSSMachinesNums Application asset. If global, all containers host nodes. Otherwise, select the number of host nodes.
     */
    public String getTCSSMachinesNums() {
        return this.TCSSMachinesNums;
    }

    /**
     * Set Application asset. If global, all containers host nodes. Otherwise, select the number of host nodes.
     * @param TCSSMachinesNums Application asset. If global, all containers host nodes. Otherwise, select the number of host nodes.
     */
    public void setTCSSMachinesNums(String TCSSMachinesNums) {
        this.TCSSMachinesNums = TCSSMachinesNums;
    }

    /**
     * Get Application asset. If global, all super nodes. Otherwise, select the number of nodes. 
     * @return EksMachinesNums Application asset. If global, all super nodes. Otherwise, select the number of nodes.
     */
    public String getEksMachinesNums() {
        return this.EksMachinesNums;
    }

    /**
     * Set Application asset. If global, all super nodes. Otherwise, select the number of nodes.
     * @param EksMachinesNums Application asset. If global, all super nodes. Otherwise, select the number of nodes.
     */
    public void setEksMachinesNums(String EksMachinesNums) {
        this.EksMachinesNums = EksMachinesNums;
    }

    public YDRaspBlackWhiteListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public YDRaspBlackWhiteListItem(YDRaspBlackWhiteListItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.LogicalSymbol != null) {
            this.LogicalSymbol = new Long(source.LogicalSymbol);
        }
        if (source.ClassNameRegexp != null) {
            this.ClassNameRegexp = new String(source.ClassNameRegexp);
        }
        if (source.SuperClassNameRegexp != null) {
            this.SuperClassNameRegexp = new String(source.SuperClassNameRegexp);
        }
        if (source.InterfacesRegexp != null) {
            this.InterfacesRegexp = new String(source.InterfacesRegexp);
        }
        if (source.AnnotationsRegexp != null) {
            this.AnnotationsRegexp = new String(source.AnnotationsRegexp);
        }
        if (source.LoaderClassNameRegexp != null) {
            this.LoaderClassNameRegexp = new String(source.LoaderClassNameRegexp);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.HandleHistory != null) {
            this.HandleHistory = new Long(source.HandleHistory);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.FilterType != null) {
            this.FilterType = new Long(source.FilterType);
        }
        if (source.AttackType != null) {
            this.AttackType = new Long(source.AttackType);
        }
        if (source.MatchMode != null) {
            this.MatchMode = new Long(source.MatchMode);
        }
        if (source.CWPEffective != null) {
            this.CWPEffective = new Long(source.CWPEffective);
        }
        if (source.CWPScope != null) {
            this.CWPScope = new Long(source.CWPScope);
        }
        if (source.CWPQuuids != null) {
            this.CWPQuuids = new String[source.CWPQuuids.length];
            for (int i = 0; i < source.CWPQuuids.length; i++) {
                this.CWPQuuids[i] = new String(source.CWPQuuids[i]);
            }
        }
        if (source.TCSSEffective != null) {
            this.TCSSEffective = new Long(source.TCSSEffective);
        }
        if (source.TCSSScope != null) {
            this.TCSSScope = new Long(source.TCSSScope);
        }
        if (source.TCSSQuuids != null) {
            this.TCSSQuuids = new String[source.TCSSQuuids.length];
            for (int i = 0; i < source.TCSSQuuids.length; i++) {
                this.TCSSQuuids[i] = new String(source.TCSSQuuids[i]);
            }
        }
        if (source.EksEffective != null) {
            this.EksEffective = new Long(source.EksEffective);
        }
        if (source.EksScope != null) {
            this.EksScope = new Long(source.EksScope);
        }
        if (source.EksNodeUniqueID != null) {
            this.EksNodeUniqueID = new String[source.EksNodeUniqueID.length];
            for (int i = 0; i < source.EksNodeUniqueID.length; i++) {
                this.EksNodeUniqueID[i] = new String(source.EksNodeUniqueID[i]);
            }
        }
        if (source.CWPMachinesNums != null) {
            this.CWPMachinesNums = new String(source.CWPMachinesNums);
        }
        if (source.TCSSMachinesNums != null) {
            this.TCSSMachinesNums = new String(source.TCSSMachinesNums);
        }
        if (source.EksMachinesNums != null) {
            this.EksMachinesNums = new String(source.EksMachinesNums);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "LogicalSymbol", this.LogicalSymbol);
        this.setParamSimple(map, prefix + "ClassNameRegexp", this.ClassNameRegexp);
        this.setParamSimple(map, prefix + "SuperClassNameRegexp", this.SuperClassNameRegexp);
        this.setParamSimple(map, prefix + "InterfacesRegexp", this.InterfacesRegexp);
        this.setParamSimple(map, prefix + "AnnotationsRegexp", this.AnnotationsRegexp);
        this.setParamSimple(map, prefix + "LoaderClassNameRegexp", this.LoaderClassNameRegexp);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "HandleHistory", this.HandleHistory);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "MatchMode", this.MatchMode);
        this.setParamSimple(map, prefix + "CWPEffective", this.CWPEffective);
        this.setParamSimple(map, prefix + "CWPScope", this.CWPScope);
        this.setParamArraySimple(map, prefix + "CWPQuuids.", this.CWPQuuids);
        this.setParamSimple(map, prefix + "TCSSEffective", this.TCSSEffective);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamArraySimple(map, prefix + "TCSSQuuids.", this.TCSSQuuids);
        this.setParamSimple(map, prefix + "EksEffective", this.EksEffective);
        this.setParamSimple(map, prefix + "EksScope", this.EksScope);
        this.setParamArraySimple(map, prefix + "EksNodeUniqueID.", this.EksNodeUniqueID);
        this.setParamSimple(map, prefix + "CWPMachinesNums", this.CWPMachinesNums);
        this.setParamSimple(map, prefix + "TCSSMachinesNums", this.TCSSMachinesNums);
        this.setParamSimple(map, prefix + "EksMachinesNums", this.EksMachinesNums);

    }
}

