/**
 * Atlas REST API
 * Atlas exposes a variety of REST endpoints to work with types, entities, lineage and data discovery.
 *
 * OpenAPI spec version: 2.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class JsonAtlasTermAssignmentHeader (
  // 
  confidence: Option[Integer] = None,
  // 
  createdBy: Option[String] = None,
  // 
  description: Option[String] = None,
  // 
  displayText: Option[String] = None,
  // 
  expression: Option[String] = None,
  // 
  relationGuid: Option[String] = None,
  // 
  source: Option[String] = None,
  status: Option[JsonAtlasTermAssignmentStatus] = None,
  // 
  steward: Option[String] = None,
  // 
  termGuid: Option[String] = None
)

