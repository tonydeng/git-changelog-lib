package se.bjurr.gitchangelog.internal.settings;

import static com.google.common.base.Charsets.UTF_8;
import static com.google.common.base.Optional.fromNullable;

import java.net.URI;
import java.util.List;

import com.google.common.base.Optional;
import com.google.common.io.Resources;
import com.google.gson.Gson;

public class Settings {
 private static Gson gson = new Gson();

 private String fromRepo;
 private String fromRef;
 private String toRef;
 private String ignoreCommitsIfMessageMatches;
 private String jiraServer;
 private String jiraIssuePattern;
 private String githubServer;
 private String githubIssuePattern;
 private String toCommit;
 private String fromCommit;
 private String untaggedName;
 private String templatePath;
 private String readableTagName;
 private String dateFormat;
 private String noIssueName;
 private List<CustomIssue> customIssues;

 public Settings() {
 }

 public void setCustomIssues(List<CustomIssue> customIssues) {
  this.customIssues = customIssues;
 }

 public void setFromRef(String fromRef) {
  this.fromRef = fromRef;
 }

 public void setToRef(String toRef) {
  this.toRef = toRef;
 }

 public String getFromRef() {
  return fromRef;
 }

 public String getToRef() {
  return toRef;
 }

 public void setFromRepo(String fromRepo) {
  this.fromRepo = fromRepo;
 }

 public String getFromRepo() {
  return fromRepo;
 }

 public void setGithubIssuePattern(String githubIssuePattern) {
  this.githubIssuePattern = githubIssuePattern;
 }

 public void setGithubServer(String githubServer) {
  this.githubServer = githubServer;
 }

 public void setIgnoreCommitsIfMessageMatches(String ignoreCommitsIfMessageMatches) {
  this.ignoreCommitsIfMessageMatches = ignoreCommitsIfMessageMatches;
 }

 public void setJiraIssuePattern(String jiraIssuePattern) {
  this.jiraIssuePattern = jiraIssuePattern;
 }

 public void setJiraServer(String jiraServer) {
  this.jiraServer = jiraServer;
 }

 public List<CustomIssue> getCustomIssues() {
  return customIssues;
 }

 public Optional<String> getGithubIssuePattern() {
  return fromNullable(githubIssuePattern);
 }

 public Optional<String> getGithubServer() {
  return fromNullable(githubServer);
 }

 public String getIgnoreCommitsIfMessageMatches() {
  return ignoreCommitsIfMessageMatches;
 }

 public Optional<String> getJiraIssuePattern() {
  return fromNullable(jiraIssuePattern);
 }

 public Optional<String> getJiraServer() {
  return fromNullable(jiraServer);
 }

 public static Settings fromFile(URI url) {
  try {
   return gson.fromJson(Resources.toString(url.toURL(), UTF_8), Settings.class);
  } catch (Exception e) {
   throw new RuntimeException("Cannot read " + url, e);
  }
 }

 public void setFromCommit(String fromCommit) {
  this.fromCommit = fromCommit;
 }

 public void setToCommit(String toCommit) {
  this.toCommit = toCommit;
 }

 public String getFromCommit() {
  return fromCommit;
 }

 public String getToCommit() {
  return toCommit;
 }

 public String getUntaggedName() {
  return untaggedName;
 }

 public void setUntaggedName(String untaggedName) {
  this.untaggedName = untaggedName;
 }

 public String getTemplatePath() {
  return templatePath;
 }

 public void setTemplatePath(String templatePath) {
  this.templatePath = templatePath;
 }

 public String getReadableTagName() {
  return readableTagName;
 }

 public String getReadableTagPattern() {
  return readableTagName;
 }

 public String getDateFormat() {
  return dateFormat;
 }

 public void setDateFormat(String dateFormat) {
  this.dateFormat = dateFormat;
 }

 public void setNoIssueName(String noIssueName) {
  this.noIssueName = noIssueName;
 }

 public void setReadableTagName(String readableTagName) {
  this.readableTagName = readableTagName;
 }

 public String getNoIssueName() {
  return noIssueName;
 }
}
