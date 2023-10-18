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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDashboard extends AbstractModel {

    /**
    * VPC instance ID, such as `vpc-bq4bzxpj`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet instance ID, such as subnet-bthucmmy.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Classiclink.
    */
    @SerializedName("Classiclink")
    @Expose
    private Long Classiclink;

    /**
    * Direct Connect gateway.
    */
    @SerializedName("Dcg")
    @Expose
    private Long Dcg;

    /**
    * Peering connection.
    */
    @SerializedName("Pcx")
    @Expose
    private Long Pcx;

    /**
    * Total number of used IPs except for CVM IP, EIP and network probe IP. The three IP types will be independently counted.
    */
    @SerializedName("Ip")
    @Expose
    private Long Ip;

    /**
    * NAT gateway.
    */
    @SerializedName("Nat")
    @Expose
    private Long Nat;

    /**
    * VPN gateway.
    */
    @SerializedName("Vpngw")
    @Expose
    private Long Vpngw;

    /**
    * Flow log.
    */
    @SerializedName("FlowLog")
    @Expose
    private Long FlowLog;

    /**
    * Network probing.
    */
    @SerializedName("NetworkDetect")
    @Expose
    private Long NetworkDetect;

    /**
    * Network ACL.
    */
    @SerializedName("NetworkACL")
    @Expose
    private Long NetworkACL;

    /**
    * Cloud Virtual Machine.
    */
    @SerializedName("CVM")
    @Expose
    private Long CVM;

    /**
    * Load balancer.
    */
    @SerializedName("LB")
    @Expose
    private Long LB;

    /**
    * Relational database.
    */
    @SerializedName("CDB")
    @Expose
    private Long CDB;

    /**
    * TencentDB for Memcached.
    */
    @SerializedName("Cmem")
    @Expose
    private Long Cmem;

    /**
    * Cloud time series database.
    */
    @SerializedName("CTSDB")
    @Expose
    private Long CTSDB;

    /**
    * TencentDB for MariaDB (TDSQL).
    */
    @SerializedName("MariaDB")
    @Expose
    private Long MariaDB;

    /**
    * TencentDB for SQL Server.
    */
    @SerializedName("SQLServer")
    @Expose
    private Long SQLServer;

    /**
    * TencentDB for PostgreSQL.
    */
    @SerializedName("Postgres")
    @Expose
    private Long Postgres;

    /**
    * Network attached storage.
    */
    @SerializedName("NAS")
    @Expose
    private Long NAS;

    /**
    * Snova data warehouse.
    */
    @SerializedName("Greenplumn")
    @Expose
    private Long Greenplumn;

    /**
    * Cloud Kafka (CKafka).
    */
    @SerializedName("Ckafka")
    @Expose
    private Long Ckafka;

    /**
    * Grocery.
    */
    @SerializedName("Grocery")
    @Expose
    private Long Grocery;

    /**
    * Data encryption service.
    */
    @SerializedName("HSM")
    @Expose
    private Long HSM;

    /**
    * Game storage - Tcaplus.
    */
    @SerializedName("Tcaplus")
    @Expose
    private Long Tcaplus;

    /**
    * Cnas.
    */
    @SerializedName("Cnas")
    @Expose
    private Long Cnas;

    /**
    * HTAP database - TiDB.
    */
    @SerializedName("TiDB")
    @Expose
    private Long TiDB;

    /**
    * EMR cluster.
    */
    @SerializedName("Emr")
    @Expose
    private Long Emr;

    /**
    * SEAL.
    */
    @SerializedName("SEAL")
    @Expose
    private Long SEAL;

    /**
    * Cloud file storage - CFS.
    */
    @SerializedName("CFS")
    @Expose
    private Long CFS;

    /**
    * Oracle.
    */
    @SerializedName("Oracle")
    @Expose
    private Long Oracle;

    /**
    * ElasticSearch Service.
    */
    @SerializedName("ElasticSearch")
    @Expose
    private Long ElasticSearch;

    /**
    * Blockchain service.
    */
    @SerializedName("TBaaS")
    @Expose
    private Long TBaaS;

    /**
    * Itop.
    */
    @SerializedName("Itop")
    @Expose
    private Long Itop;

    /**
    * Cloud database audit.
    */
    @SerializedName("DBAudit")
    @Expose
    private Long DBAudit;

    /**
    * Enterprise TencentDB - CynosDB for Postgres.
    */
    @SerializedName("CynosDBPostgres")
    @Expose
    private Long CynosDBPostgres;

    /**
    * TencentDB for Redis.
    */
    @SerializedName("Redis")
    @Expose
    private Long Redis;

    /**
    * TencentDB for MongoDB.
    */
    @SerializedName("MongoDB")
    @Expose
    private Long MongoDB;

    /**
    * A distributed cloud database - TencentDB for TDSQL.
    */
    @SerializedName("DCDB")
    @Expose
    private Long DCDB;

    /**
    * An enterprise-grade TencentDB - CynosDB for MySQL.
    */
    @SerializedName("CynosDBMySQL")
    @Expose
    private Long CynosDBMySQL;

    /**
    * Subnets.
    */
    @SerializedName("Subnet")
    @Expose
    private Long Subnet;

    /**
    * Route table.
    */
    @SerializedName("RouteTable")
    @Expose
    private Long RouteTable;

    /**
     * Get VPC instance ID, such as `vpc-bq4bzxpj`. 
     * @return VpcId VPC instance ID, such as `vpc-bq4bzxpj`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC instance ID, such as `vpc-bq4bzxpj`.
     * @param VpcId VPC instance ID, such as `vpc-bq4bzxpj`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet instance ID, such as subnet-bthucmmy. 
     * @return SubnetId Subnet instance ID, such as subnet-bthucmmy.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet instance ID, such as subnet-bthucmmy.
     * @param SubnetId Subnet instance ID, such as subnet-bthucmmy.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Classiclink. 
     * @return Classiclink Classiclink.
     */
    public Long getClassiclink() {
        return this.Classiclink;
    }

    /**
     * Set Classiclink.
     * @param Classiclink Classiclink.
     */
    public void setClassiclink(Long Classiclink) {
        this.Classiclink = Classiclink;
    }

    /**
     * Get Direct Connect gateway. 
     * @return Dcg Direct Connect gateway.
     */
    public Long getDcg() {
        return this.Dcg;
    }

    /**
     * Set Direct Connect gateway.
     * @param Dcg Direct Connect gateway.
     */
    public void setDcg(Long Dcg) {
        this.Dcg = Dcg;
    }

    /**
     * Get Peering connection. 
     * @return Pcx Peering connection.
     */
    public Long getPcx() {
        return this.Pcx;
    }

    /**
     * Set Peering connection.
     * @param Pcx Peering connection.
     */
    public void setPcx(Long Pcx) {
        this.Pcx = Pcx;
    }

    /**
     * Get Total number of used IPs except for CVM IP, EIP and network probe IP. The three IP types will be independently counted. 
     * @return Ip Total number of used IPs except for CVM IP, EIP and network probe IP. The three IP types will be independently counted.
     */
    public Long getIp() {
        return this.Ip;
    }

    /**
     * Set Total number of used IPs except for CVM IP, EIP and network probe IP. The three IP types will be independently counted.
     * @param Ip Total number of used IPs except for CVM IP, EIP and network probe IP. The three IP types will be independently counted.
     */
    public void setIp(Long Ip) {
        this.Ip = Ip;
    }

    /**
     * Get NAT gateway. 
     * @return Nat NAT gateway.
     */
    public Long getNat() {
        return this.Nat;
    }

    /**
     * Set NAT gateway.
     * @param Nat NAT gateway.
     */
    public void setNat(Long Nat) {
        this.Nat = Nat;
    }

    /**
     * Get VPN gateway. 
     * @return Vpngw VPN gateway.
     */
    public Long getVpngw() {
        return this.Vpngw;
    }

    /**
     * Set VPN gateway.
     * @param Vpngw VPN gateway.
     */
    public void setVpngw(Long Vpngw) {
        this.Vpngw = Vpngw;
    }

    /**
     * Get Flow log. 
     * @return FlowLog Flow log.
     */
    public Long getFlowLog() {
        return this.FlowLog;
    }

    /**
     * Set Flow log.
     * @param FlowLog Flow log.
     */
    public void setFlowLog(Long FlowLog) {
        this.FlowLog = FlowLog;
    }

    /**
     * Get Network probing. 
     * @return NetworkDetect Network probing.
     */
    public Long getNetworkDetect() {
        return this.NetworkDetect;
    }

    /**
     * Set Network probing.
     * @param NetworkDetect Network probing.
     */
    public void setNetworkDetect(Long NetworkDetect) {
        this.NetworkDetect = NetworkDetect;
    }

    /**
     * Get Network ACL. 
     * @return NetworkACL Network ACL.
     */
    public Long getNetworkACL() {
        return this.NetworkACL;
    }

    /**
     * Set Network ACL.
     * @param NetworkACL Network ACL.
     */
    public void setNetworkACL(Long NetworkACL) {
        this.NetworkACL = NetworkACL;
    }

    /**
     * Get Cloud Virtual Machine. 
     * @return CVM Cloud Virtual Machine.
     */
    public Long getCVM() {
        return this.CVM;
    }

    /**
     * Set Cloud Virtual Machine.
     * @param CVM Cloud Virtual Machine.
     */
    public void setCVM(Long CVM) {
        this.CVM = CVM;
    }

    /**
     * Get Load balancer. 
     * @return LB Load balancer.
     */
    public Long getLB() {
        return this.LB;
    }

    /**
     * Set Load balancer.
     * @param LB Load balancer.
     */
    public void setLB(Long LB) {
        this.LB = LB;
    }

    /**
     * Get Relational database. 
     * @return CDB Relational database.
     */
    public Long getCDB() {
        return this.CDB;
    }

    /**
     * Set Relational database.
     * @param CDB Relational database.
     */
    public void setCDB(Long CDB) {
        this.CDB = CDB;
    }

    /**
     * Get TencentDB for Memcached. 
     * @return Cmem TencentDB for Memcached.
     */
    public Long getCmem() {
        return this.Cmem;
    }

    /**
     * Set TencentDB for Memcached.
     * @param Cmem TencentDB for Memcached.
     */
    public void setCmem(Long Cmem) {
        this.Cmem = Cmem;
    }

    /**
     * Get Cloud time series database. 
     * @return CTSDB Cloud time series database.
     */
    public Long getCTSDB() {
        return this.CTSDB;
    }

    /**
     * Set Cloud time series database.
     * @param CTSDB Cloud time series database.
     */
    public void setCTSDB(Long CTSDB) {
        this.CTSDB = CTSDB;
    }

    /**
     * Get TencentDB for MariaDB (TDSQL). 
     * @return MariaDB TencentDB for MariaDB (TDSQL).
     */
    public Long getMariaDB() {
        return this.MariaDB;
    }

    /**
     * Set TencentDB for MariaDB (TDSQL).
     * @param MariaDB TencentDB for MariaDB (TDSQL).
     */
    public void setMariaDB(Long MariaDB) {
        this.MariaDB = MariaDB;
    }

    /**
     * Get TencentDB for SQL Server. 
     * @return SQLServer TencentDB for SQL Server.
     */
    public Long getSQLServer() {
        return this.SQLServer;
    }

    /**
     * Set TencentDB for SQL Server.
     * @param SQLServer TencentDB for SQL Server.
     */
    public void setSQLServer(Long SQLServer) {
        this.SQLServer = SQLServer;
    }

    /**
     * Get TencentDB for PostgreSQL. 
     * @return Postgres TencentDB for PostgreSQL.
     */
    public Long getPostgres() {
        return this.Postgres;
    }

    /**
     * Set TencentDB for PostgreSQL.
     * @param Postgres TencentDB for PostgreSQL.
     */
    public void setPostgres(Long Postgres) {
        this.Postgres = Postgres;
    }

    /**
     * Get Network attached storage. 
     * @return NAS Network attached storage.
     */
    public Long getNAS() {
        return this.NAS;
    }

    /**
     * Set Network attached storage.
     * @param NAS Network attached storage.
     */
    public void setNAS(Long NAS) {
        this.NAS = NAS;
    }

    /**
     * Get Snova data warehouse. 
     * @return Greenplumn Snova data warehouse.
     */
    public Long getGreenplumn() {
        return this.Greenplumn;
    }

    /**
     * Set Snova data warehouse.
     * @param Greenplumn Snova data warehouse.
     */
    public void setGreenplumn(Long Greenplumn) {
        this.Greenplumn = Greenplumn;
    }

    /**
     * Get Cloud Kafka (CKafka). 
     * @return Ckafka Cloud Kafka (CKafka).
     */
    public Long getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set Cloud Kafka (CKafka).
     * @param Ckafka Cloud Kafka (CKafka).
     */
    public void setCkafka(Long Ckafka) {
        this.Ckafka = Ckafka;
    }

    /**
     * Get Grocery. 
     * @return Grocery Grocery.
     */
    public Long getGrocery() {
        return this.Grocery;
    }

    /**
     * Set Grocery.
     * @param Grocery Grocery.
     */
    public void setGrocery(Long Grocery) {
        this.Grocery = Grocery;
    }

    /**
     * Get Data encryption service. 
     * @return HSM Data encryption service.
     */
    public Long getHSM() {
        return this.HSM;
    }

    /**
     * Set Data encryption service.
     * @param HSM Data encryption service.
     */
    public void setHSM(Long HSM) {
        this.HSM = HSM;
    }

    /**
     * Get Game storage - Tcaplus. 
     * @return Tcaplus Game storage - Tcaplus.
     */
    public Long getTcaplus() {
        return this.Tcaplus;
    }

    /**
     * Set Game storage - Tcaplus.
     * @param Tcaplus Game storage - Tcaplus.
     */
    public void setTcaplus(Long Tcaplus) {
        this.Tcaplus = Tcaplus;
    }

    /**
     * Get Cnas. 
     * @return Cnas Cnas.
     */
    public Long getCnas() {
        return this.Cnas;
    }

    /**
     * Set Cnas.
     * @param Cnas Cnas.
     */
    public void setCnas(Long Cnas) {
        this.Cnas = Cnas;
    }

    /**
     * Get HTAP database - TiDB. 
     * @return TiDB HTAP database - TiDB.
     */
    public Long getTiDB() {
        return this.TiDB;
    }

    /**
     * Set HTAP database - TiDB.
     * @param TiDB HTAP database - TiDB.
     */
    public void setTiDB(Long TiDB) {
        this.TiDB = TiDB;
    }

    /**
     * Get EMR cluster. 
     * @return Emr EMR cluster.
     */
    public Long getEmr() {
        return this.Emr;
    }

    /**
     * Set EMR cluster.
     * @param Emr EMR cluster.
     */
    public void setEmr(Long Emr) {
        this.Emr = Emr;
    }

    /**
     * Get SEAL. 
     * @return SEAL SEAL.
     */
    public Long getSEAL() {
        return this.SEAL;
    }

    /**
     * Set SEAL.
     * @param SEAL SEAL.
     */
    public void setSEAL(Long SEAL) {
        this.SEAL = SEAL;
    }

    /**
     * Get Cloud file storage - CFS. 
     * @return CFS Cloud file storage - CFS.
     */
    public Long getCFS() {
        return this.CFS;
    }

    /**
     * Set Cloud file storage - CFS.
     * @param CFS Cloud file storage - CFS.
     */
    public void setCFS(Long CFS) {
        this.CFS = CFS;
    }

    /**
     * Get Oracle. 
     * @return Oracle Oracle.
     */
    public Long getOracle() {
        return this.Oracle;
    }

    /**
     * Set Oracle.
     * @param Oracle Oracle.
     */
    public void setOracle(Long Oracle) {
        this.Oracle = Oracle;
    }

    /**
     * Get ElasticSearch Service. 
     * @return ElasticSearch ElasticSearch Service.
     */
    public Long getElasticSearch() {
        return this.ElasticSearch;
    }

    /**
     * Set ElasticSearch Service.
     * @param ElasticSearch ElasticSearch Service.
     */
    public void setElasticSearch(Long ElasticSearch) {
        this.ElasticSearch = ElasticSearch;
    }

    /**
     * Get Blockchain service. 
     * @return TBaaS Blockchain service.
     */
    public Long getTBaaS() {
        return this.TBaaS;
    }

    /**
     * Set Blockchain service.
     * @param TBaaS Blockchain service.
     */
    public void setTBaaS(Long TBaaS) {
        this.TBaaS = TBaaS;
    }

    /**
     * Get Itop. 
     * @return Itop Itop.
     */
    public Long getItop() {
        return this.Itop;
    }

    /**
     * Set Itop.
     * @param Itop Itop.
     */
    public void setItop(Long Itop) {
        this.Itop = Itop;
    }

    /**
     * Get Cloud database audit. 
     * @return DBAudit Cloud database audit.
     */
    public Long getDBAudit() {
        return this.DBAudit;
    }

    /**
     * Set Cloud database audit.
     * @param DBAudit Cloud database audit.
     */
    public void setDBAudit(Long DBAudit) {
        this.DBAudit = DBAudit;
    }

    /**
     * Get Enterprise TencentDB - CynosDB for Postgres. 
     * @return CynosDBPostgres Enterprise TencentDB - CynosDB for Postgres.
     */
    public Long getCynosDBPostgres() {
        return this.CynosDBPostgres;
    }

    /**
     * Set Enterprise TencentDB - CynosDB for Postgres.
     * @param CynosDBPostgres Enterprise TencentDB - CynosDB for Postgres.
     */
    public void setCynosDBPostgres(Long CynosDBPostgres) {
        this.CynosDBPostgres = CynosDBPostgres;
    }

    /**
     * Get TencentDB for Redis. 
     * @return Redis TencentDB for Redis.
     */
    public Long getRedis() {
        return this.Redis;
    }

    /**
     * Set TencentDB for Redis.
     * @param Redis TencentDB for Redis.
     */
    public void setRedis(Long Redis) {
        this.Redis = Redis;
    }

    /**
     * Get TencentDB for MongoDB. 
     * @return MongoDB TencentDB for MongoDB.
     */
    public Long getMongoDB() {
        return this.MongoDB;
    }

    /**
     * Set TencentDB for MongoDB.
     * @param MongoDB TencentDB for MongoDB.
     */
    public void setMongoDB(Long MongoDB) {
        this.MongoDB = MongoDB;
    }

    /**
     * Get A distributed cloud database - TencentDB for TDSQL. 
     * @return DCDB A distributed cloud database - TencentDB for TDSQL.
     */
    public Long getDCDB() {
        return this.DCDB;
    }

    /**
     * Set A distributed cloud database - TencentDB for TDSQL.
     * @param DCDB A distributed cloud database - TencentDB for TDSQL.
     */
    public void setDCDB(Long DCDB) {
        this.DCDB = DCDB;
    }

    /**
     * Get An enterprise-grade TencentDB - CynosDB for MySQL. 
     * @return CynosDBMySQL An enterprise-grade TencentDB - CynosDB for MySQL.
     */
    public Long getCynosDBMySQL() {
        return this.CynosDBMySQL;
    }

    /**
     * Set An enterprise-grade TencentDB - CynosDB for MySQL.
     * @param CynosDBMySQL An enterprise-grade TencentDB - CynosDB for MySQL.
     */
    public void setCynosDBMySQL(Long CynosDBMySQL) {
        this.CynosDBMySQL = CynosDBMySQL;
    }

    /**
     * Get Subnets. 
     * @return Subnet Subnets.
     */
    public Long getSubnet() {
        return this.Subnet;
    }

    /**
     * Set Subnets.
     * @param Subnet Subnets.
     */
    public void setSubnet(Long Subnet) {
        this.Subnet = Subnet;
    }

    /**
     * Get Route table. 
     * @return RouteTable Route table.
     */
    public Long getRouteTable() {
        return this.RouteTable;
    }

    /**
     * Set Route table.
     * @param RouteTable Route table.
     */
    public void setRouteTable(Long RouteTable) {
        this.RouteTable = RouteTable;
    }

    public ResourceDashboard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceDashboard(ResourceDashboard source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Classiclink != null) {
            this.Classiclink = new Long(source.Classiclink);
        }
        if (source.Dcg != null) {
            this.Dcg = new Long(source.Dcg);
        }
        if (source.Pcx != null) {
            this.Pcx = new Long(source.Pcx);
        }
        if (source.Ip != null) {
            this.Ip = new Long(source.Ip);
        }
        if (source.Nat != null) {
            this.Nat = new Long(source.Nat);
        }
        if (source.Vpngw != null) {
            this.Vpngw = new Long(source.Vpngw);
        }
        if (source.FlowLog != null) {
            this.FlowLog = new Long(source.FlowLog);
        }
        if (source.NetworkDetect != null) {
            this.NetworkDetect = new Long(source.NetworkDetect);
        }
        if (source.NetworkACL != null) {
            this.NetworkACL = new Long(source.NetworkACL);
        }
        if (source.CVM != null) {
            this.CVM = new Long(source.CVM);
        }
        if (source.LB != null) {
            this.LB = new Long(source.LB);
        }
        if (source.CDB != null) {
            this.CDB = new Long(source.CDB);
        }
        if (source.Cmem != null) {
            this.Cmem = new Long(source.Cmem);
        }
        if (source.CTSDB != null) {
            this.CTSDB = new Long(source.CTSDB);
        }
        if (source.MariaDB != null) {
            this.MariaDB = new Long(source.MariaDB);
        }
        if (source.SQLServer != null) {
            this.SQLServer = new Long(source.SQLServer);
        }
        if (source.Postgres != null) {
            this.Postgres = new Long(source.Postgres);
        }
        if (source.NAS != null) {
            this.NAS = new Long(source.NAS);
        }
        if (source.Greenplumn != null) {
            this.Greenplumn = new Long(source.Greenplumn);
        }
        if (source.Ckafka != null) {
            this.Ckafka = new Long(source.Ckafka);
        }
        if (source.Grocery != null) {
            this.Grocery = new Long(source.Grocery);
        }
        if (source.HSM != null) {
            this.HSM = new Long(source.HSM);
        }
        if (source.Tcaplus != null) {
            this.Tcaplus = new Long(source.Tcaplus);
        }
        if (source.Cnas != null) {
            this.Cnas = new Long(source.Cnas);
        }
        if (source.TiDB != null) {
            this.TiDB = new Long(source.TiDB);
        }
        if (source.Emr != null) {
            this.Emr = new Long(source.Emr);
        }
        if (source.SEAL != null) {
            this.SEAL = new Long(source.SEAL);
        }
        if (source.CFS != null) {
            this.CFS = new Long(source.CFS);
        }
        if (source.Oracle != null) {
            this.Oracle = new Long(source.Oracle);
        }
        if (source.ElasticSearch != null) {
            this.ElasticSearch = new Long(source.ElasticSearch);
        }
        if (source.TBaaS != null) {
            this.TBaaS = new Long(source.TBaaS);
        }
        if (source.Itop != null) {
            this.Itop = new Long(source.Itop);
        }
        if (source.DBAudit != null) {
            this.DBAudit = new Long(source.DBAudit);
        }
        if (source.CynosDBPostgres != null) {
            this.CynosDBPostgres = new Long(source.CynosDBPostgres);
        }
        if (source.Redis != null) {
            this.Redis = new Long(source.Redis);
        }
        if (source.MongoDB != null) {
            this.MongoDB = new Long(source.MongoDB);
        }
        if (source.DCDB != null) {
            this.DCDB = new Long(source.DCDB);
        }
        if (source.CynosDBMySQL != null) {
            this.CynosDBMySQL = new Long(source.CynosDBMySQL);
        }
        if (source.Subnet != null) {
            this.Subnet = new Long(source.Subnet);
        }
        if (source.RouteTable != null) {
            this.RouteTable = new Long(source.RouteTable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Classiclink", this.Classiclink);
        this.setParamSimple(map, prefix + "Dcg", this.Dcg);
        this.setParamSimple(map, prefix + "Pcx", this.Pcx);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Nat", this.Nat);
        this.setParamSimple(map, prefix + "Vpngw", this.Vpngw);
        this.setParamSimple(map, prefix + "FlowLog", this.FlowLog);
        this.setParamSimple(map, prefix + "NetworkDetect", this.NetworkDetect);
        this.setParamSimple(map, prefix + "NetworkACL", this.NetworkACL);
        this.setParamSimple(map, prefix + "CVM", this.CVM);
        this.setParamSimple(map, prefix + "LB", this.LB);
        this.setParamSimple(map, prefix + "CDB", this.CDB);
        this.setParamSimple(map, prefix + "Cmem", this.Cmem);
        this.setParamSimple(map, prefix + "CTSDB", this.CTSDB);
        this.setParamSimple(map, prefix + "MariaDB", this.MariaDB);
        this.setParamSimple(map, prefix + "SQLServer", this.SQLServer);
        this.setParamSimple(map, prefix + "Postgres", this.Postgres);
        this.setParamSimple(map, prefix + "NAS", this.NAS);
        this.setParamSimple(map, prefix + "Greenplumn", this.Greenplumn);
        this.setParamSimple(map, prefix + "Ckafka", this.Ckafka);
        this.setParamSimple(map, prefix + "Grocery", this.Grocery);
        this.setParamSimple(map, prefix + "HSM", this.HSM);
        this.setParamSimple(map, prefix + "Tcaplus", this.Tcaplus);
        this.setParamSimple(map, prefix + "Cnas", this.Cnas);
        this.setParamSimple(map, prefix + "TiDB", this.TiDB);
        this.setParamSimple(map, prefix + "Emr", this.Emr);
        this.setParamSimple(map, prefix + "SEAL", this.SEAL);
        this.setParamSimple(map, prefix + "CFS", this.CFS);
        this.setParamSimple(map, prefix + "Oracle", this.Oracle);
        this.setParamSimple(map, prefix + "ElasticSearch", this.ElasticSearch);
        this.setParamSimple(map, prefix + "TBaaS", this.TBaaS);
        this.setParamSimple(map, prefix + "Itop", this.Itop);
        this.setParamSimple(map, prefix + "DBAudit", this.DBAudit);
        this.setParamSimple(map, prefix + "CynosDBPostgres", this.CynosDBPostgres);
        this.setParamSimple(map, prefix + "Redis", this.Redis);
        this.setParamSimple(map, prefix + "MongoDB", this.MongoDB);
        this.setParamSimple(map, prefix + "DCDB", this.DCDB);
        this.setParamSimple(map, prefix + "CynosDBMySQL", this.CynosDBMySQL);
        this.setParamSimple(map, prefix + "Subnet", this.Subnet);
        this.setParamSimple(map, prefix + "RouteTable", this.RouteTable);

    }
}

