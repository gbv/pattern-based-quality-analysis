package qualitypatternmodel.utilityclasses;

public class Constants {
	public static final String VARIABLE = "$var";
	public static final String LISTVARIABLE = "$list";
	public static final String SOME = "some ";
	public static final String EVERY = "every ";
	public static final String SATISFIES = "\nsatisfies ";
	public static final String FOR = "\nfor ";
	public static final String LET = "\nlet ";
	public static final String WHERE = "\nwhere ";
	public static final String RETURN = "\nreturn ";
	public static final String IN = " in ";
	public static final String INSTANCES_FOLDER = "instances";
	public static final String TRANSLATION_TESTS_FOLDER = INSTANCES_FOLDER + "/translationtests";
	public static final String VALIDITY_CHECKS_FOLDER = INSTANCES_FOLDER + "/validitychecks";
	public static final String PLAYGROUND_FOLDER = INSTANCES_FOLDER + "/playground";
	public static final String INSTANCE_FILE_ENDING = ".patternstructure";
	public static final String REGEX_TIME_HOURS_MINUTES = "(0[1-9]|1[0-9]|2[0-4]):(0[1-9]|[1-5][0-9])";
	public static final String REGEX_TIME_HOURS_MINUTES_SECONDS = REGEX_TIME_HOURS_MINUTES + ":(0[1-9]|[1-5][0-9])(.[0-9]*)?";
	public static final String REGEX_DATE = "[0-9][0-9][0-9][0-9]-(0[1-9]|1[0-2])-(0[1-9]|[0-2][0-9]|3[0-1])";
	public static final String REGEX_DATE_TIME = REGEX_DATE + "T" + REGEX_TIME_HOURS_MINUTES_SECONDS;
	public static final String REGEX_POSITIVE_NEGATIVE = "(\\+|-)";

}
